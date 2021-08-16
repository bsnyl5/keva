<p align="center">
  <img width="150" src="https://i.imgur.com/z0c9bV7.png">
</p>

Keva is an open source (Apache 2.0 licensed), off-heap in-memory data structure, used as a database or cache. Keva
provides value types such as strings, object, integer, long, double, float.

Keva Server provides access to mutable data structures via a set of commands, which are sent using a server-client model
with TCP sockets and a simple protocol. So different processes/clients can query and modify the same data structures in
a shared way.

![GitHub Workflow Status (branch)](https://img.shields.io/github/workflow/status/tuhuynh27/keva/Build/master?label=build&style=flat-square)
![Lines of code](https://img.shields.io/tokei/lines/github/tuhuynh27/keva?style=flat-square)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/tuhuynh27/keva?style=flat-square)
![GitHub](https://img.shields.io/github/license/tuhuynh27/keva?style=flat-square)

## Quick Start

[Get started in 5 minutes.](https://keva.dev)

## Changelogs

[Learn about the latest improvements.](https://jinyframework.com/guide/changelogs.html)

## Development

Want to file a bug, contribute some code, or improve documentation? Excellent!

First, [see Developer Guide](https://jinyframework.com/guide/developer-guide.html).

Pull requests are encouraged and always welcome. [Pick an issue](https://github.com/tuhuynh27/keva/issues) and help
us out!

To install and work on Keva locally:

```command
git clone git@github.com:tuhuynh27/keva.git
cd keva
./gradlew dependencies
```

Run server:

```command
./gradlew --no-daemon --quiet --console plain :server:run
```

Run CLI client:

```command
./gradlew --no-daemon --quiet --console plain :cli-client:run
```

Build server:

```command
./gradlew :server:shadowJar
```

Build CLI client:

```command
./gradlew :cli-client:shadowJar
```

## License

[Apache License 2.0](https://github.com/tuhuynh27/keva/blob/master/LICENSE)
