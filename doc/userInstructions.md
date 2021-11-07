<!-- SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk -->
<!-- -->
<!-- SPDX-License-Identifier: Apache-2.0 -->

# Full installation instructions

These installation instructions should be identical for Windows, GNU/Linux distributions, or Mac. Please post an issue if this is not the case.

It is likely you have this installed already, but you will need a [Java](https://java.com/en/download) virtual machine. If necessary, install java from the link above. It must be runnable from the command line as shown in the next sections.

Verify java is installed correctly from your shell, like so:

`$ java --version`

That should output the version numbers. If not, then it is not installed correctly.

Next,

- Download the latest `.jar` file from the [release](https://github.com/galacticalex/urltester/tree/master/release) directory
- Locate the `.jar` on your operating system. For example, it might be in `~/Downloads/...`
- Note the path to the `.jar`'s location, such as `~/Downloads/0.5.0-urltester.jar`
- Locate the file which contains the URLs you wish to check on your operatin system.
- Note the path to the file's location, such as `~/Documents/my-url-file.txt`
- Run the following command, replacing the paths as necessary:

`java -jar ~/Downloads/0.0.2-urltester.jar ~Documents/my-url-file.txt`


