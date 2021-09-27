<!-- SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk -->
<!-- -->
<!-- SPDX-License-Identifier: EPL-2.0 -->

# urltester

A Java productivity tool written in Clojure which tests the existence of web-servers provided by URLs in a text-based file. These text files could be `.txt`, `.md`, or even source code file like `.clj`. Currently, the applet scans the input file for valid URLs and attempts to open tabs in Firefox &reg;.

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
- Some files have `webtester` instead of `urltester` (should not be an issue for use, might be for dev)

## Full installation instructions

### Prerequisites

It is likely you have the pre-requisites already. But you will need:

- The [Firefox](https://www.mozilla.org/en-GB/firefox/new) internet browser 
- A [Java](https://java.com/en/download) virtual machine

If necessary, install these programs from the links above. These must be runnable from the command line as shown in the next sections.

### Windows

- tbc

### GNU/Linux

Verify firefox and java are installed correctly from your shell, like so:

`firefox --help`

`java --version`

These should output the version numbers of the two programs. If not, then they are not installed correctly.

- Download the latest `.jar` file from the [release](https://github.com/galacticalex/urltester/tree/master/release) directory
- Locate the `.jar` on your operating system. For example, it might be in `~/Downloads/...`
- Note the path to the `.jar`'s location, such as `~/Downloads/0.0.2-urltester.jar`
- Locate the file which contains the URLs you wish to check on your operatin system.
- Note the path to the file's location, such as `~/Documents/my-url-file.txt`
- Run the following command, replacing the paths as necessary:

`java -jar ~/Downloads/0.0.2-urltester.jar ~Documents/my-url-file.txt`


