LANGS="java:beans php delphi csharp rb go py js:node"
HASH_DIR="hash"

create_hash() {
  local file=$1
  sha256sum "$file" | awk '{print $1}' > "$HASH_DIR/$(basename "$file").sha256"
}

# return 0 if file has changed
hasFileChange() {
  local file=$1
  local hash_file="$HASH_DIR/$(basename "$file").sha256"
  if [ -f "$hash_file" ]; then
    local hash=$(sha256sum "$file" | awk '{print $1}')
    local hash_saved=$(cat "$hash_file")
    if [ "$hash" = "$hash_saved" ]; then
      echo "Skipping $file"
      return 1
    fi
  fi
  return 0
}

# Generate thrift files
generateThrift() {
local path_files=$1
for FILE in "$path_files"/thrift/*.thrift
do  
    if hasFileChange "$FILE"; then
        for LANG in $LANGS
        do
            echo "Geração do .thrift $FILE para a linguagem $LANG..."
            docker run --rm -u "$(id -u)" -v "$PWD:$(pwd)" thrift:0.9.3 thrift -o $(pwd)/$path_files --gen $LANG $(pwd)/$FILE
            create_hash "$FILE"
        done
    fi

done
}

generateThrift "layout-ras"
generateThrift "layout-cidadao"
generateThrift "layout-camada-transport"