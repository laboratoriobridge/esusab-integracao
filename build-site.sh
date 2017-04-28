#!/bin/bash
git submodule add --force git@github.com:esusab/integracao-private.git
git submodule update
jekyll build -s ./integracao-private/docs/
cp -r _site/* ./v210/
rm -rf .git/modules/integracao-private/
git submodule deinit --force .
rm .gitmodules
rm -r integracao-private/