#!/bin/sh

swiftc \
    -module-name shared_lib \
    -emit-library -o libshared_lib.dylib \
    -emit-module -emit-module-path ./ \
    -parse-as-library \
    -L ./target/debug/ \
    -lshared_lib \
    -Xcc -fmodule-map-file=src/shared_libFFI.modulemap \
    src/shared_lib.swift