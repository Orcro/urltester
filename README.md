<!-- SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk -->
<!-- -->
<!-- SPDX-License-Identifier: Apache-2.0 -->

# urltester

A Java productivity tool written in Clojure which tests the existence of web-servers that are provided by URLs in a text-based file. These text files could be `.txt`, `.md`, or even source code file like `.clj` or `.py`. Output is currently boolen results to standard out which looks something like this:

```
URL: https://www.duckduckgo.com is valid.
URL: https://facebook.com is valid.
URL: https://mynonexistantdomain.com is invalid.
```

## Quick Use

> Full installation instructions are available in `./docs/userInstructions.md`

Download the latest version in `./releases/` and run as a java applet:

```bash
$ java -jar urltester-0.5.0.jar my_file_to_check.md
```

Progam output can be used in unix shell pipelines (but this is untested). For example, to open the results in the `Vi` editor:

```bash
$ java -jar urltester-0.5.0.jar my_file_to_check.md | vi -
```

## Licensing

Copyright © 2021 Orcro Ltd.

This program and the accompanying materials are made available under the terms of the Apache License Version 2.0 which is available in `./LICENSES/`. A copy is also available at this permalink [www.apache.org/licenses/LICENSE-2.0.txt](www.apache.org/licenses/LICENSE-2.0.txt).

### Dependencies

There is one direct dependency [clj-http](https://github.com/dakrone/clj-http). That software package is released under the [MIT](https://mit-license.org) license with the following copyright notice:

> Copyright (c) 2013 M. Lee Hinman

### REUSE

This project is compliant with version 3.0 of the [REUSE](https://reuse.software) specification and uses SPDX standard file headers throughout.

### SBOM

_A software bill of materials will be generated before version 1 is released._

## Contact

:house_with_garden: Orcro Ltd. team@orcro.co.uk

:hammer: Maintainer Alex alexander.murphy@orcro.co.uk
