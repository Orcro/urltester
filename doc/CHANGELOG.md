<!-- SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk -->
<!-- -->
<!-- SPDX-License-Identifier: Apache-2.0 -->

# Change Log

All notable changes to this project will be documented in this file. This change log follows the conventions of [keepachangelog.com](http://keepachangelog.com/).

The unreleased version is not compiled, you must do this yourself if you want those features with `lein build`. The most recent compiled build (which is probably what you want) is [0.5.0].

## [Unreleased] - 18-01-2022

### Added

- REUSE badge
- Third sample file added, for testing [concurrency](https://github.com/galacticalex/urltester/issues/10) and [duplicate urls](https://github.com/galacticalex/urltester/issues/9). 

### Changed

- Refined readme
- `(source map)` replaced with `(source pmap)`

### Removed

- n/a

### Fixed

- Changelog version link corrected 

## [0.5.1] - 07-11-21

### Added

- Colours! Red/Green for invalid/valid urls respectively

### Changed

- n/a

### Removed

- n/a

### Fixed

- n/a

## 0.5.0 - 07-11-21

### Added

- Function to handle startup behaviour, and errors using literate programming style
- Separate installation instruction guide
- Colours! Red/Green for invalid/valid urls respectively

### Changed

- Refactored `core.clj` to reduce number of functions for clarity
- Versions correctly applied throughout

### Removed

- Old url get function

### Fixed

- Results of checks now output correctly


## 0.0.4 - 2021-10-20

### Added

- clj-http now GETs data from urls, if data is returned successfully, then server must be active
- `src/urltester/scratch.clj` added as a scratch-pad for testing code in the REPL before adding to core

### Changed

- License changed from EPL-2.0 to Apache-2.0
- project on 0.0.4

### Removed

- Function to open links in firefox browsers (gnu/linux specific)
- Intermediary script cleaned up before program exit

### Fixed

- n/a

## 0.0.3 - 2021-09-27

### Added

- all urls in given file are opened in new firefox windows

### Changed

- `core.clj` structured better
- used `.sh` script now - won't work for windows yet

### Removed

- no longer prints urls list directly

### Fixed

- N/A

## 0.0.2 - 2021-09-27

### Added

- Helpful error message if no filepath is provided
- Helpful error message if the filepath is missing/incorrect

### Changed

- Licencing is now [reuse](https://reuse.software) compliant

### Removed

- Hello world code!

### Fixed

- Most references to "webtester" removed

## 0.0.1 - 2021-09-27

### Added

- Template directory structure
- EPL licence

### Changed

- N/A

### Removed

- N/A

### Fixed

- N/A

[Unreleased]: https://github.com/galacticalex/urltester
[0.5.1]: https://github.com/galacticalex/urltester/release
