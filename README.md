<!-- SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk -->
<!-- -->
<!-- SPDX-License-Identifier: Apache-2.0 -->

# urltester

[![REUSE status](https://api.reuse.software/badge/github.com/Orcro/urltester)](https://api.reuse.software/info/github.com/Orcro/urltester)

A Java productivity tool written in Clojure which tests the existence of web-servers that are provided by URLs in a text-based file. These text files could be `.txt`, `.md`, or even source code file like `.clj` or `.py`. Boolean results are returned to standard out, and when viewed in a terminal looks something like this:

```
URL: https://www.duckduckgo.com is valid.
URL: https://facebook.com is valid.
URL: https://mynonexistantdomain.com is invalid.
```

## Quick Use

> Full installation instructions are available in `./docs/userInstructions.md`

Download the latest version from the `./releases/` directory, and run like you would any java program:

```bash
$ java -jar urltester-0.5.1.jar my_file_to_check.md
```

Progam output can be used in unix shell pipelines (but this is untested). For example, to open the results in the `Vi` editor:

```bash
$ java -jar urltester-0.5.1.jar my_file_to_check.md | vi -
```

## Licensing

Copyright © 2021 Orcro Ltd.

This program and the accompanying materials are made available under the terms of the Apache License Version 2.0 which is available in `./LICENSES/`. A copy is also available at this permalink [www.apache.org/licenses/LICENSE-2.0.txt](www.apache.org/licenses/LICENSE-2.0.txt).

### Dependencies

`urltester` depends on the following projects:

#### [clj-http](https://github.com/dakrone/clj-http) version 3.12.3

This project is released under [MIT](https://mit-license.org) with the following copyright notice:

> Copyright (c) 2013 M. Lee Hinman

#### [clerk](https://github.com/nextjournal/clerk) version 0.5.346

This project is released under [ISC](https://www.isc.org/licenses/) with the following copyright notice:

> Copyright 2021 Nextjournal GmbH.

#### [incanter](https://github.com/incanter/incanter) version 1.9.3

This project appears to be released under the [EPL version 1](https://www.eclipse.org/legal/epl-v10.html) with no copyright text. _Please use the contact details below if you are the copyright holder and wish to update this information._

## Contact

:house_with_garden: Orcro Ltd. team@orcro.co.uk

:hammer: Maintainer alexander.murphy@orcro.co.uk
