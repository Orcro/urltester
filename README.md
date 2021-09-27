# webtester

A Java applet written in Clojure which tests the existence of web-servers provided by URLs in a text-based file. These text files could be `.txt`, `.md`, or even source code file like `.clj`. Currently, the applet scans the input file for valid URLs and attempts to open tabs in Firefox &reg;.

## Quick Use

> Full installation instructions are provided at the end of this readme.

Find the latest version in `./releases/`

```clojure
java -jar 0.0.1-urltester.jar $file-to-test
```

## License

Copyright © 2021 Orcro Ltd.

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

## Contact

Orcro Ltd. team@orcro.co.uk

Maintainer: Alex alexander.murphy@orcro.co.uk

## Known bugs/quirks

- Large numbers of URLs can quickly increase RAM utilization

## Full installation instructions

### Windows

- tbc

### GNU/Linux

- tbc
