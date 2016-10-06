LANGS="java:beans php delphi csharp rb go py"

for LANG in $LANGS
do
	for file in ./thrift/*.thrift
	do
		thrift --gen $LANG $file
	done

done
