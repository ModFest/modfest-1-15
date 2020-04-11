import newformat.builder.FnPatternList

mcVersion = "1.15.2"
title = "Modfest"
authors = listOf("b0undarybreaker")
modloader { fabric(Fabric.intermediary.v_1_15_2) }
icon = rootFolder.resolve("icon.png")

pack {
  multimc {
    // path tp the published modpack definition (not sk always)
    skPackUrl = "https://modfest.net/1.15/pack/modfest.json"
    selfupdateUrl = "https://modfest.net/1.15/pack/modfest.json"
  }
  experimental {
    userFiles = FnPatternList(
            include = listOf("servers.dat")
    )
  }
}

root<Curse> {
  releaseTypes = setOf(FileType.Release, FileType.Beta)
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
    +FabricMod.lint
    +FabricMod.mechanizedSteamPower
    +FabricMod.netWeight
    +FabricMod.reliccraft
    +ProjectID(373156) //simple accessories
    +FabricMod.tacocraftFabric
    +ProjectID(373504) //tenor
    +FabricMod.underpowered
    +FabricMod.unfortunately
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
    +FabricMod.customtitlescreen

    //optional mods
    group {
      optional {
        selected = false
      }
    }.list {
      +FabricMod.retino {
        description = "Fixes issues with retina display on Mac. Don't use otherwise."
      }
      +FabricMod.miniHud {
        description = "Displays server TPS and MSPT. Helpful for debugging."
      }
    }

    //direct links
    withTypeClass(Direct::class) {
    }.list {
      +"capybaraCommune" {
        url = "https://github.com/mjart/capybara-commune/releases/download/1.1/capybara-commune-1.1.jar"
        description = "A Mod which adds the amazing animal 'the Capybara' which chills out all aggressive mobs."
      }
      +"compuGlobalHyperMeganet" {
        url = "https://github.com/immibis/modfest2/releases/download/v1.0.1-modfest/compuglobalhypermeganet-SayNoToBeesYesToSylladices-1.0.1.jar"
        description = "Makes it painful to use your inventory"
      }
      +"crimson" {
        url = "https://github.com/valoeghese/Crimson/releases/download/v1.0.4/crimson-1.0.4.jar"
        description = "Adds a dangerous new crimson biome linked to a system of crafting magic devices from imbued gemstones"
      }
      +"crystalModifiers" {
        url = "https://github.com/Maowcraft/CrystalModifiers/releases/download/1.0.0/CrystalModifiers-1.15.2-1.0.0.jar"
        description = "Harness the power of new naturally spawning crystals to apply potion effects to you and your enemies in a more strategy-oriented, quick, and reliable method."
      }
      +"drones" {
        url = "https://ci.dblsaiko.net/job/drones/lastSuccessfulBuild/artifact/build/libs/drones-0.1.3.jar"
        description = "Adds remote-controllable drones with camera"
        useUrlTxt = false
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
        url = "https://github.com/ExtraCrafTX/ExtraDetectors/releases/download/v0.0.3/extradetectors-0.0.3.jar"
        description = "Adds a weather detector similar to a clock"
      }
      +"greenstone" {
        url = "https://github.com/Forkk/Greenstone/releases/download/v0.0.1/greenstone-circuit-mod-0.0.1.jar"
        description = "A basic computer mod with a reverse Polish notation language."
      }
      +"kevlar" {
        url = "https://github.com/Earthcomputer/Kevlar/releases/download/v1.0/kevlar-1.0-SNAPSHOT.jar"
        description = "Early to mid game tech mod"
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
        url = "https://github.com/trewghil/offshoreplus/releases/download/0.0.3/offshoreplus-0.0.3.jar"
        description = "Adds more cool stuff to the ocean"
      }
      +"overgrownCities" {
        url = "https://github.com/SuperCoder7979/overgrowncities/releases/download/0.1.0/overgrowncities-0.1.0.jar"
        description = "Creates a new dimension with an old decaying city hidden among the overgrown wilderness with an Abandoned Warehouse in the Overworld to let you enter it!"
      }
      +"reichenbach" {
        url = "https://cdn.discordapp.com/attachments/696494482698535052/697878335916605572/reichenbach-0.0.1.jar"
        description = "Inspired by Satisfactory & Factorio, Reichenbach aims to distance itself from usual tech mods through interesting crafting mechanics & machinery."
      }
      +"saltsMill" {
        url = "https://github.com/Chocohead/Modjam/releases/download/v0.5/Salts.Mill-0.5.jar"
        description = "Loads custom mods as \"cassettes\" from WAV files"
      }
      +"theBlue" {
        url = "https://github.com/RypoFalem/The-Blue/releases/download/1.15.2-1.1/the_blue-1.15.2-1.1.jar"
        description = "Adds a fishing net block to passively generate fishing loot"
      }
      +"vantacine" {
        url = "https://cdn.discordapp.com/attachments/692799982058864650/696924186861633617/vantacine-1.0.0.jar"
        description = "Improves the Nether through miscellaneous additions that bring together utility, decoration, and fun."
      }

      //assistant mods
      +"bruhMoment" {
        url = "https://cdn.discordapp.com/attachments/696494482698535052/698608389202378875/bruh-moment-0.1.0.jar"
        description = "Blacklist for interactions in adventure mode"
      }
      +"modfest-extras" {
        url = "https://github.com/TheBrokenRail/ModFest-1.15-Extras/releases/download/1.0.4/modfest-extras.jar"
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
