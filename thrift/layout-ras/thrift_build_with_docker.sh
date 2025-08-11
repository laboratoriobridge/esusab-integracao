LANGS="java:beans php delphi csharp rb go py js:node"

rm -r gen-*

for LANG in $LANGS
do
    for FILE in thrift/*.thrift
    do
        echo "Geração do .thrift $FILE para a linguagem $LANG..."
        docker run --rm -u "$(id -u)" -v "$PWD:$(pwd)" thrift:0.9.3 thrift -o $(pwd) --gen $LANG $(pwd)/$FILE
    done

done
