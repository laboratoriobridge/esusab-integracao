#!/bin/bash
git submodule add --force git@github.com:esusab/integracao-private.git
cd .git/modules/integracao-private/
git checkout 56b22c8bfec4879908254c37fb0813abb540a7d6
cd ../../../
jekyll build -s ./integracao-private/docs/
cp -r _site/* ./v210/
rm -rf .git/modules/integracao-private/
git submodule deinit --force .
rm .gitmodules
rm -r integracao-private/