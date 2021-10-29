<!-- SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk -->
<!-- -->
<!-- SPDX-License-Identifier: Apache-2.0 -->

# urltester

A Java productivity tool written in Clojure which tests the existence of web-servers provided by URLs in a text-based file. These text files could be `.txt`, `.md`, or even source code file like `.clj`. Currently, the output is raw - boolean values indicating which links are valid.

## Quick Use

> Full installation instructions are provided at the end of this readme.

Find the latest version in `./releases/`, run that as a java applet.

Currently, the output is rather limited, but the url test is robust.

```clojure
java -jar ut004.jar $file-to-test
```

## License

Copyright © 2021 Orcro Ltd.

This program and the accompanying materials are made available under the terms of the Apache License Version 2.0 which is available at [www.apache.org/licenses/LICENSE-2.0.txt](www.apache.org/licenses/LICENSE-2.0.txt).

### Dependencies

There is one dependency [clj-http](https://github.com/dakrone/clj-http). That software package is released under the MIT license with the following copyright notice:

> Copyright (c) 2013 M. Lee Hinman

### REUSE

This project is [REUSE](https://reuse.software) compliant and uses SPDX standard file headers.

## Contact

Orcro Ltd. team@orcro.co.uk

Maintainer: Alex alexander.murphy@orcro.co.uk

## Future objectives

Change methodology for testing files from "open windows for manual verification" to "request http data and validate there is a response". This should streamline the use and make automation much easier. A manual verification option can remain.

## Known bugs/quirks

- Currently doesn't actually output results of tests (unless run as a leiningen project)
- Some files have `webtester` instead of `urltester` (should not be an issue for use, might be for dev)

## Full installation instructions

### Prerequisites

It is likely you have this pre-requisite already. But you will need a [Java](https://java.com/en/download) virtual machine.

If necessary, install that from the link above. It must be runnable from the command line as shown in the next sections.

### Windows

- tbc

### GNU/Linux

Verify java is installed correctly from your shell, like so:

`java --version`

That should output the version numbers. If not, then it is not installed correctly.

Next,

- Download the latest `.jar` file from the [release](https://github.com/galacticalex/urltester/tree/master/release) directory
- Locate the `.jar` on your operating system. For example, it might be in `~/Downloads/...`
- Note the path to the `.jar`'s location, such as `~/Downloads/0.0.2-urltester.jar`
- Locate the file which contains the URLs you wish to check on your operatin system.
- Note the path to the file's location, such as `~/Documents/my-url-file.txt`
- Run the following command, replacing the paths as necessary:

`java -jar ~/Downloads/0.0.2-urltester.jar ~Documents/my-url-file.txt`


