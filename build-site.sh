#!/bin/bash
git submodule add --force git@github.com:laboratoriobridge/esusab-integracao-private.git
git submodule update
jekyll build -s ./esusab-integracao-private/docs/
cp -r _site/* ./
rm -rf .git/modules/esusab-integracao-private/
git submodule deinit --force .
rm .gitmodules
rm -r esusab-integracao-private/
