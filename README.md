修复了模组中的玩家动作上的问题，使他完美的兼容动作材质包

# PlayerMobs
Adds hostile mobs that have the skin of players

# Custom skin textures

More info about adding/overriding textures of the player mobs can be found [here](https://github.com/GoryMoon/PlayerMobs/wiki/Custom-player-mob-skins)

License
----
GNU GPL v.3

## Building

Use Java 21. The project points its plugin and dependency repositories at `https://neoforged.forgecdn.net/releases`. NeoGradle creates additional repositories internally, so pass the included init script to redirect those requests too:

```powershell
gradle -I neo-mirror.init.gradle build
```

The arm-model and EMF cape-rendering patches target NeoForge 21.1.92. The mod metadata supports NeoForge 21.1 and newer. In-game rendering still needs verification with the FA+Player resource pack and EMF enabled.
