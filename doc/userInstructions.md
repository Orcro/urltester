<!-- SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk -->
<!-- -->
<!-- SPDX-License-Identifier: Apache-2.0 -->

# Full installation instructions

These installation instructions should be identical for Windows, GNU/Linux distributions, or Macs. Please post an issue if this is not the case.

It is likely you have this installed already, but you will need a [Java](https://java.com/en/download) virtual machine. If necessary, install java from the link above. It must be runnable from the command line as shown in the next sections.

Verify java is installed correctly from your shell, like so:

`java --version`

That should output the version numbers. If not, then it is not installed correctly.

Next, download the latest `.jar` file from the [releases](https://github.com/galacticalex/urltester/tree/master/release). Once you have that downloaded you are ready to use it!

# Usage instructions

- Locate the `.jar` file on your operating system. For example, it might be in your usual downloads directory.
- Note the path to the `.jar`'s location, such as `~/Downloads/0.5.1-urltester.jar` (you may move the `.jar` to somewhere else if you prefer, just remember where you put it)!
- Locate the file which contains the URLs you wish to check for.
- Note the path to the file's location, such as `~/Documents/my-url-file.txt`
- Run the following command, replacing the paths to the `.jar` and URL file as necessary:

`java -jar ~/Downloads/0.0.2-urltester.jar ~Documents/my-url-file.txt`

# Development instructions

Download via git with 

`git clone https://github.com/galacticalex/urltester`

Switch into the downloaded directory `urltester/`

You will need [leiningen](https://leiningen.org/) (unless you really know what you are doing), and can start an interactive repl with:

`lein repl`
