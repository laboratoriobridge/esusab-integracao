LANGS="java:beans php delphi csharp rb go py"

for LANG in $LANGS
do
    for FILE in thrift/*.thrift
    do
        thrift --gen $LANG $FILE
    done

done