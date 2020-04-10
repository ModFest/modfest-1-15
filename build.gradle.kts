plugins {
    // kotlin("jvm") version "1.3.70" // automatically applied
    // idea // automatically applied
    id("voodoo") version "0.5.0-SNAPSHOT"
}

voodoo {
    addTask("build") {
        build()
    }
    addTask(name = "pack_mmc-fat") {
        pack().multimcFat()
    }
    addTask(name = "pack_server") {
        pack().server()
    }
    addTask(name = "test_mmc") {
        test().multimc()
    }
    addTask(name = "pack_experimental") {
        pack().experimental()
    }
    addTask(name = "pack_mmc-experimental") {
        pack().multimcExperimental()
    }
    addTask(name = "buildAndPackAll") {
        build()
        pack().multimcFat()
        pack().server()
        pack().experimental()
        pack().multimcExperimental()
    }
    addTask(name = "packAll") {
        pack().multimcFat()
        pack().server()
        pack().experimental()
        pack().multimcExperimental()
    }

    generateCurseforgeMods("FabricMod", "1.15", "1.15.1", "1.15.2", categories = listOf("Fabric"))
    generateCurseforgeTexturepacks("TexturePack", "1.15", "1.15.1", "1.15.2")
    generateFabric("Fabric", true)
}