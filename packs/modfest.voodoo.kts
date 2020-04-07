mcVersion = "1.15.2"
title = "Modfest"
authors = listOf("b0undarybreaker")
modloader { fabric(Fabric.intermediary.v_1_15_2) }
icon = rootDir.resolve("icon.png")

pack {
  multimc {
    // path tp the published modpack definition (not sk always) TODO: place to publish
//    skPackUrl = "https://path/to/modfest.json"
//    selfupdateUrl = "https://path/to/modfest.json"
  }
}

root<Curse> {
  it.list {
    +FabricMod.archcreatia
    +FabricMod.azuma
    +FabricMod.campanion
    +FabricMod.chunkInAGlobe
    +FabricMod.composing
    +FabricMod.cornflower
    +FabricMod.dihydrogenMonoxideReloaded
    +FabricMod.esther
    +FabricMod.funkyForcefields
    +FabricMod.gravestones
    +FabricMod.lilTater
//    +FabricMod.lint //TODO: move back here once fix uploaded to curseforge, added below
    +FabricMod.mechanizedSteamPower
    +ProjectID(306170) //net weight
    +FabricMod.reliccraft
    +ProjectID(373156) //simple accessories
    +FabricMod.tacocraftFabric //TODO: move back here once fingerprint bug is fixed, added below
    +ProjectID(373504) //tenor
    +FabricMod.underpowered //TODO: move back here once fingerprint bug is fixed, added below
    +ProjectID(373581) //unfortunately
    +FabricMod.yungsBetterMineshaftsFabric

    //dependencies
    +FabricMod.fabricApi
    +FabricMod.fabricLanguageKotlin
    +ProjectID(309275) //fabric language scala TODO: server crash
//    +FabricMod.techreborn //TODO: move back once lint fixes dep
    +FabricMod.trinketsFabric

    //assistant mods
    +FabricMod.hwyla
    +FabricMod.lithium
    +FabricMod.modmenu
//    +FabricMod.notEnoughCrashes
    +FabricMod.roughlyEnoughItems

    //direct links
    withTypeClass(Direct::class) {
    }.list {
      +"capybaraCommune" {//TODO: update once FOML is removed
        url = "https://github.com/mjart/capybara-commune/releases/download/1.1/capybara-commune-1.1.jar"
        description = "A Mod which adds the amazing animal 'the Capybara' which chills out all aggressive mobs."
      }
      +"crimson" {
        url = "https://github.com/valoeghese/Crimson/releases/download/v1.0.3/crimson-1.0.3.jar"
        description = "Adds a dangerous new crimson biome linked to a system of crafting magic devices from imbued gemstones"
      }
      +"crystalModifiers" {
        url = "https://github.com/Maowcraft/CrystalModifiers/releases/download/1.0.0/CrystalModifiers-1.15.2-1.0.0.jar"
        description = "Harness the power of new naturally spawning crystals to apply potion effects to you and your enemies in a more strategy-oriented, quick, and reliable method."
      }
      +"drones" {
        url = "https://ci.dblsaiko.net/job/drones/lastSuccessfulBuild/artifact/build/libs/drones-0.1.3.jar"
        description = "Adds remote-controllable drones with camera"
      }
      +"elementCycle" {
        url = "https://github.com/michaelPoul/element/releases/download/v1.0/element-1.0.0.jar"
        description = "Adds magic blocks to repair iron tools"
      }
      +"enchantersExperiments" {
        url = "https://github.com/Juuxel/ModFest-2020/releases/download/1.0.0/EnchantersExperiments-1.0.0+1.15.2.jar"
        description = "Enchanter's Experiments adds a bunch of new experimental enchantments that can be found in magic gifts."
      }
      +"extraDetectors" {
        url = "https://github.com/ExtraCrafTX/ExtraDetectors/releases/download/v0.0.1/extradetectors-0.0.1.jar"
        description = "Adds a weather detector similar to a clock"
      }
      +"greenstone" {
        url = "https://github.com/Forkk/Greenstone/releases/download/modfest-v2/greenstone-circuit-mod-0.0.0.jar"
        description = "A basic computer mod with a reverse Polish notation language."
      }
      +"kevlar" {
        url = "https://github.com/Earthcomputer/Kevlar/releases/download/v1.0/kevlar-1.0-SNAPSHOT.jar"
        description = "Early to mid game tech mod"
      }
      +"lint" { //TODO: remove once fix is on curseforge
        url = "https://cdn.discordapp.com/attachments/696494482698535052/697013869796655194/lint-1.2.0.jar"
      }
      +"littleRocketMan" {
        url = "https://cdn.discordapp.com/attachments/528472643221848085/694976720930996344/LittleRocketMan-1.0.0.jar"
        description = "Little Rocket Man is a mod that adds Gnome Chompski into the world of minecraft. His mission is to reach space by any means necessary... Your mission is to help him with that."
      }
      +"metalSupply" {
        url = "https://github.com/Reoseah/metal-supply/releases/download/modfest/metal-supply-1.0.0.jar"
        description = "Adds Crank and Grinder inspired by Applied Energistics' Grindstone, and 5 new metals: lead, tin, copper, silver and bronze."
      }
      +"offShorePlus" {
        url = "https://github.com/trewghil/offshoreplus/releases/download/0.0.1/offshoreplus-0.0.1.jar"
        description = "Adds more cool stuff to the ocean"
      }
      +"overgrownCities" {
        url = "https://github.com/SuperCoder7979/overgrowncities/releases/download/0.1.0/overgrowncities-0.1.0.jar"
        description = "Creates a new dimension with an old decaying city hidden among the overgrown wilderness with an Abandoned Warehouse in the Overworld to let you enter it!"
      }
      +"reichenbach" {
        url = "https://cdn.discordapp.com/attachments/627962741826650123/696986713351913506/reichenbach-0.0.1.jar"
        description = "Inspired by Satisfactory & Factorio, Reichenbach aims to distance itself from usual tech mods through interesting crafting mechanics & machinery."
      }
      +"saltsMill" {
        url = "https://github.com/Chocohead/Modjam/releases/download/v0.3/Salts.Mill-0.3.jar"
        description = "Loads custom mods as \"cassettes\" from WAV files"
      }
      +"sylladex" {
        url = "https://immibisdotcom.s3.amazonaws.com/mcmoddl/modfest2/compuglobalhypermeganet-SayNoToBeesYesToSylladices-1.0.0.jar"
        description = "Makes it painful to use your inventory"
      }
//      +"tacocraft" { //TODO: remove once fingerprint fixes
//        url = "https://github.com/franiscoder/TacoCraft/releases/download/1.0.0/tacocraft-1.0.0.jar"
//      }
      +"theBlue" {
        url = "https://github.com/RypoFalem/The-Blue/releases/download/1.15.2-1.0/the_blue-1.15.2-1.0.jar"
        description = "Adds a fishing net block to passively generate fishing loot"
      }
//      +"underpowered" {//TODO: remove once fingerprint fixes
//        url = "https://cdn.discordapp.com/attachments/696494482698535052/697103427515318322/Underpowered-1.15.2-fabric-1.0.2.jar"
//      }
      +"vantacine" {
        url = "https://cdn.discordapp.com/attachments/692799982058864650/696924186861633617/vantacine-1.0.0.jar"
        description = "Improves the Nether through miscellaneous additions that bring together utility, decoration, and fun."
      }

      //assistant mods
      +"modfest-extras" {
        url = "https://github.com/TheBrokenRail/ModFest-1.15-Extras/releases/download/1.0.3/modfest-extras.jar"
        description = "Extra Resources for the ModFest 1.15 Modpack"
      }
//      +"sodium" { //TODO: add in if it becomes stable by the time the pack goes out
//        url = "https://cdn.discordapp.com/attachments/690311875287580743/696873450878533702/sodium-mc1.15.2-fabric-0.1.0.jar"
//      }
      +"techreborn" { //TODO: remove once lint fixes dep
        url = "http://maven.modmuss50.me/TechReborn/TechReborn-1.15/3.3.6%2Bbuild.207/TechReborn-1.15-3.3.6%2Bbuild.207.jar"
      }
    }
  }
}
