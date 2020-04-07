mcVersion = "1.15.2"
title = "Modfest"
authors = listOf("b0undarybreaker")
modloader { fabric(Fabric.intermediary.v_1_15_2) }

root<Curse> {
  it.list {
    +ProjectID(373595) //gravestones
    +FabricMod.funkyForcefields
    //TODO: azuma goes here when CF approves
//    +ProjectID(373653) //mechanized TODO: move back here once CF propagates, added below
    +ProjectID(373591) //yung's better mineshafts
    +ProjectID(373581) //unfortunately
    +FabricMod.underpowered //TODO: TR crash
    +FabricMod.cornflower
    +FabricMod.composing
//    +FabricMod.campanion //TODO: mixin crash and fails to resolve
//    +FabricMod.lint //TODO: mixin fix propagation, added below
    +FabricMod.esther
    +ProjectID(373504) //tenor
    +FabricMod.dihydrogenMonoxideReloaded
//    +ProjectID(306170) //net weight TODO: move back here once not beta, added below
    +FabricMod.archcreatia
//    +ProjectID(373156) //simple accessories TODO: move back here once not beta, added below
    +FabricMod.reliccraft
//    +ProjectID(373093) //tacocraft TODO: fingerprint bs, added below
    +FabricMod.chunkInAGlobe

    //dependencies
    +FabricMod.fabricApi
    +ProjectID(309275) //fabric language scala TODO: server crash
    +FabricMod.fabricLanguageKotlin
    +FabricMod.techreborn

    //assistant mods
    +FabricMod.modmenu
    +FabricMod.roughlyEnoughItems
    +FabricMod.hwyla
    +FabricMod.lithium
//    +FabricMod.notEnoughCrashes

    //direct links
    withTypeClass(Direct::class) {
    }.list {
      +"extraDetectors" {
        url = "https://github.com/ExtraCrafTX/ExtraDetectors/releases/download/v0.0.1/extradetectors-0.0.1.jar"
        description = "Adds a weather detector similar to a daylight sensor"
      }
      +"vantacine" {
        url = "https://cdn.discordapp.com/attachments/692799982058864650/696851421672374272/vantacine-1.0.0-modfest.jar"
        description = "Improves the Nether through miscellaneous additions that bring together utility, decoration, and fun."
      }
      +"offShorePlus" {
        url = "https://github.com/trewghil/offshoreplus/releases/download/0.0.1/offshoreplus-0.0.1.jar"
        description = "Adds more cool stuff to the ocean"
      }
      "overgrownCities" {
        url = "https://github.com/SuperCoder7979/overgrowncities/releases/download/0.1.0/overgrowncities-0.1.0.jar"
        description = "Creates a new dimension with an old decaying city hidden among the overgrown wilderness with an Abandoned Warehouse in the Overworld to let you enter it!"
      }
      +"lilTater" {
        url = "https://github.com/Vatuu/lil-Tater/releases/download/0.9-SNAPSHOT/lil-tater-0.9.1-SNAPSHOT.jar"
        description = "Adds lil' taters to the game. Crucial for any modded instance."
      }
      +"greenstone" {
        url = "https://github.com/Forkk/Greenstone/releases/download/modfest-v2/greenstone-circuit-mod-0.0.0.jar"
        description = "A basic computer mod with a reverse Polish notation language."
      }
      +"saltsMill" {//TODO: early riser crash
        url = "https://github.com/Chocohead/Modjam/releases/download/v0.1/Salts.Mill-0.1.jar"
        description = "Loads custom mods as \"cassettes\" from WAV files"
      }
      +"element" {
        url = "https://github.com/michaelPoul/element/releases/download/v1.0/element-1.0.0.jar"
        description = "Adds magic blocks to repair iron tools"
      }
      +"crimson" {
        url = "https://github.com/valoeghese/Crimson/releases/download/v1.0.2/crimson-1.0.2.jar"
        description = "Adds a dangerous new crimson biome linked to a system of crafting magic devices from imbued gemstones"
      }
      +"kevlar" {
        url = "https://github.com/Earthcomputer/Kevlar/releases/download/v1.0/kevlar-1.0-SNAPSHOT.jar"
        description = "Early to mid game tech mod"
      }
      +"mechanized" {//TODO: remove once beta is out
        url = "https://github.com/Snakefangox/Mechanized/releases/download/modfest/Mechanized-1.0.0.jar"
      }
      "simpleaccessories" { //TODO: remove once beta is out
        url = "https://github.com/rjmunhoz/simple-accessories/releases/download/v0.1.3/simpleaccessories-0.1.3.jar"
      }
      "netweight" { //TODO: remove once beta is out
        url = "https://github.com/UpcraftLP/Net-Weight/releases/download/0.1.0-alpha%2Bmodfest/net-weight-0.1.0-alpha+custom-1.15.jar"
      }
      +"azuma" { //TODO: curse version when it's out
        url = "https://github.com/TeamSuperPeople/azuma/releases/download/1.2.0-beta-1.15.2/azuma-1.2.0.jar"
        description = "Our mod adds a special crafting system powered by a magical energy alongside several useful utility items and tools."
      }
      +"lint" { //TODO: crash fix
        url = "https://cdn.discordapp.com/attachments/696868182635315312/696870819460153364/lint-1.1.0.jar"
      }
      +"tacocraft" { //TODO: curseforge fingerprint issue
        url = "https://github.com/franiscoder/TacoCraft/releases/download/1.0.0/tacocraft-1.0.0.jar"
      }
      "sodium" { //TODO: curseforge
        url = "https://cdn.discordapp.com/attachments/690311875287580743/696873450878533702/sodium-mc1.15.2-fabric-0.1.0.jar"
      }
      +"sylladex" {
        url = "https://immibisdotcom.s3.amazonaws.com/mcmoddl/modfest2/compuglobalhypermeganet-SayNoToBeesYesToSylladices-1.0.0.jar"
        description = "Makes it painful to use your inventory"
      }
      "metalSupply" {
        url = "https://github.com/Reoseah/metal-supply/releases/download/modfest/metal-supply-1.0.0.jar"
        description = "Adds Crank and Grinder inspired by Applied Energistics' Grindstone, and 5 new metals: lead, tin, copper, silver and bronze."
      }
      +"reichenbach" { //TODO: FOML crash
        url = "https://voxel.games/thesupersecretsection/reichenbach-0.0.1.jar"
        description = "Inspired by Satisfactory & Factorio, Reichenbach aims to distance itself from usual tech mods through interesting crafting mechanics & machinery."
      }
      +"theBlue" {
        url = "https://github.com/RypoFalem/The-Blue/releases/download/1.15.2-1.0/the_blue-1.15.2-1.0.jar"
        description = "Adds a fishing net block to passively generate fishing loot"
      }
      +"enchantersExperiments" {
        url = "https://github.com/Juuxel/ModFest-2020/releases/download/1.0.0/EnchantersExperiments-1.0.0+1.15.2.jar"
        description = "Enchanter's Experiments adds a bunch of new experimental enchantments that can be found in magic gifts."
      }
      +"drones" {
        url = "https://ci.dblsaiko.net/job/drones/lastSuccessfulBuild/artifact/build/libs/drones-0.1.3.jar"
        description = "Adds remote-controllable drones with camera"
      }
      +"capybaraCommune" {
        url = "https://github.com/mjart/capybara-commune/releases/download/1.0/capybara-commune-1.0.jar"
        description = "A Mod which adds the amazing animal 'the Capybara' which chills out all aggressive mobs."
      }
      +"crystalModifiers" {
        url = "https://github.com/Maowcraft/CrystalModifiers/releases/download/1.0.0/CrystalModifiers-1.15.2-1.0.0.jar"
        description = "Harness the power of new naturally spawning crystals to apply potion effects to you and your enemies in a more strategy-oriented, quick, and reliable method."
      }
      +"littleRocketMan" {
        url = "https://cdn.discordapp.com/attachments/528472643221848085/694976720930996344/LittleRocketMan-1.0.0.jar"
        description = "Little Rocket Man is a mod that adds Gnome Chompski into the world of minecraft. His mission is to reach space by any means necessary... Your mission is to help him with that."
      }
      +"modfest-extras" {
        url = "https://github.com/TheBrokenRail/ModFest-1.15-Extras/releases/download/1.0/modfest-extras.jar"
        description = "Extra Resources for the ModFest 1.15 Modpack"
      }
    }
  }
}
