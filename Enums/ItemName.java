package rush.enums;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("all")
public enum ItemName {
	
	AIR__0("Ar"),
	STONE__0("Pedra"),
	STONE__1("Granito"),
	STONE__2("Granito polido"),
	STONE__3("Diorito"),
	STONE__4("Diorito polido"),
	STONE__5("Andesito"),
	STONE__6("Andesito polido"),
	GRASS__0("Bloco de grama"),
	DIRT__0("Terra"),
	DIRT__1("Terra grossa"),
	DIRT__2("Podzol"),
	COBBLESTONE__0("Pedregulho"),
	WOOD__0("T�buas de carvalho"),
	WOOD__1("T�buas de pinheiro"),
	WOOD__2("T�buas de eucalipto"),
	WOOD__3("T�buas de madeira da selva"),
	WOOD__4("T�buas de ac�cia"),
	WOOD__5("T�buas de carvalho escuro"),
	SAPLING__0("Muda de carvalho"),
	SAPLING__1("Muda de pinheiro"),
	SAPLING__2("Muda de eucalipto"),
	SAPLING__3("Muda de �rvore da selva"),
	SAPLING__4("Muda de ac�cia"),
	SAPLING__5("Muda de carvalho escuro"),
	BEDROCK__0("Rocha matriz"),
	WATER__0("�gua"),
	STATIONARY_WATER__0("�gua"),
	LAVA__0("Lava"),
	STATIONARY_LAVA__0("Lava"),
	SAND__0("Areia"),
	SAND__1("Areia vermelha"),
	GRAVEL__0("Cascalho"),
	GOLD_ORE__0("Min�rio de ouro"),
	IRON_ORE__0("Min�rio de ferro"),
	COAL_ORE__0("Min�rio de carv�o"),
	LOG__0("Maderia de carvalho"),
	LOG__1("Maderia de pinheiro"),
	LOG__2("Maderia de eucalipto"),
	LOG__3("Maderia da selva"),
	LEAVES__0("Folhas de carvalho"),
	LEAVES__1("Folhas de pinheiro"),
	LEAVES__2("Folhas de eucalipto"),
	LEAVES__3("Folhas da selva "),
	SPONGE__0("Esponja"),
	SPONGE__1("Esponja molhada"),
	GLASS__0("Vidro"),
	LAPIS_ORE__0("Min�rio de l�pis-laz�li"),
	LAPIS_BLOCK__0("Bloco de l�pis-laz�li"),
	DISPENSER__0("Ejetor"),
	SANDSTONE__0("Arenito"),
	SANDSTONE__1("Arenito talhado"),
	SANDSTONE__2("Arenito liso"),
	NOTE_BLOCK__0("Bloco musical"),
	BED_BLOCK__0("Cama"),
	POWERED_RAIL__0("Trilho el�trico"),
	DETECTOR_RAIL__0("Trilho detector"),
	PISTON_STICKY_BASE__0("Pist�o grudento"),
	WEB__0("Teia de Aranha"),
	LONG_GRASS__0("Arbusto"),
	LONG_GRASS__1("Grama"),
	LONG_GRASS__2("Samambaia"),
	DEAD_BUSH__0("Arbusto Morto"),
	PISTON_BASE__0("Pist�o"),
	PISTON_EXTENSION__0("Pist�o"),
	WOOL__0("L� branca"),
	WOOL__1("L� laranja"),
	WOOL__2("L� magenta"),
	WOOL__3("L� azul clara"),
	WOOL__4("L� amarela"),
	WOOL__5("L� verde-lim�o"),
	WOOL__6("L� rosa"),
	WOOL__7("L� cinza"),
	WOOL__8("L� cinza clara"),
	WOOL__9("L� ciano"),
	WOOL__10("L� roxa"),
	WOOL__11("L� azul"),
	WOOL__12("L� marrom"),
	WOOL__13("L� verde"),
	WOOL__14("L� vermelha"),
	WOOL__15("L� preta"),
	PISTON_MOVING_PIECE__0("Pist�o"),
	YELLOW_FLOWER__0("Dente-de-Le�o"),
	RED_ROSE__0("Popula"),
	RED_ROSE__1("Orqu�dea azul"),
	RED_ROSE__2("Hort�ncia"),
	RED_ROSE__3("Flor silvestre azul"),
	RED_ROSE__4("Tulipa vermelha"),
	RED_ROSE__5("Tulipa laranja"),
	RED_ROSE__6("Tulipa branca"),
	RED_ROSE__7("Tulipa rosa"),
	RED_ROSE__8("Margarida"),
	BROWN_MUSHROOM__0("Cogumelo"),
	RED_MUSHROOM__0("Cogumelo"),
	GOLD_BLOCK__0("Bloco de ouro"),
	IRON_BLOCK__0("Bloco de ferro"),
	DOUBLE_STEP__0("Laje dupla de pedra"),
	DOUBLE_STEP__1("Laje dupla de arenito"),
	DOUBLE_STEP__2("Laje dupla de madeira"),
	DOUBLE_STEP__3("Laje dupla de pedregulho"),
	DOUBLE_STEP__4("Laje dupla de tijolos"),
	DOUBLE_STEP__5("Laje dupla de tijolos de pedra"),
	DOUBLE_STEP__6("Laje dupla de tijolos do Nether"),
	DOUBLE_STEP__7("Laje dupla de quartzo"),
	STEP__0("Laje de pedra"),
	STEP__1("Laje de arenito"),
	STEP__2("Laje de madeira"),
	STEP__3("Laje de pedregulho"),
	STEP__4("Laje de tijolos"),
	STEP__5("Laje de tijolos de pedra"),
	STEP__6("Laje de tijolos do Nether"),
	STEP__7("Laje de quartzo"),
	BRICK__0("Tijolos"),
	TNT__0("Dinamite"),
	BOOKSHELF__0("Estante"),
	MOSSY_COBBLESTONE__0("Pedra com musgo"),
	OBSIDIAN__0("Obsidiana"),
	TORCH__0("Tocha"),
	FIRE__0("Fogo"),
	MOB_SPAWNER__0("Gerador de monstros"),
	WOOD_STAIRS__0("Escadas de carvalho"),
	CHEST__0("Ba�"),
	REDSTONE_WIRE__0("P� de Redstone"),
	DIAMOND_ORE__0("Min�rio de diamante"),
	DIAMOND_BLOCK__0("Bloco de diamante"),
	WORKBENCH__0("Bancada de trabalho"),
	CROPS__0("Planta��o"),
	SOIL__0("Terra arada"),
	FURNACE__0("Fornalha"),
	BURNING_FURNACE__0("Fornalha"),
	SIGN_POST__0("Placa"),
	WOODEN_DOOR__0("Porta de madeira"),
	LADDER__0("Escada"),
	RAILS__0("Trilho"),
	COBBLESTONE_STAIRS__0("Escadas de pedra"),
	WALL_SIGN__0("Placa"),
	LEVER__0("Alavanca"),
	STONE_PLATE__0("Placa de press�o de pedra"),
	IRON_DOOR_BLOCK__0("Porta de ferro"),
	WOOD_PLATE__0("Placa de press�o de madeira"),
	REDSTONE_ORE__0("Min�rio de redstone"),
	GLOWING_REDSTONE_ORE__0("Min�rio de redstone"),
	REDSTONE_TORCH_OFF__0("Tocha de redstone"),
	REDSTONE_TORCH_ON__0("Tocha de restone"),
	STONE_BUTTON__0("Bot�o"),
	SNOW__0("Neve"),
	ICE__0("Gelo"),
	SNOW_BLOCK__0("Neve"),
	CACTUS__0("Cacto"),
	CLAY__0("Argila"),
	SUGAR_CANE_BLOCK__0("Canas de a�ucar"),
	JUKEBOX__0("Jukebox"),
	FENCE__0("Cerca de carvalho"),
	PUMPKIN__0("Ab�bora"),
	NETHERRACK__0("Rocha do Nether"),
	SOUL_SAND__0("Areia de almas"),
	GLOWSTONE__0("Pedra luminosa"),
	PORTAL__0("Portal"),
	JACK_O_LANTERN__0("Ab�bora de Halloween"),
	CAKE_BLOCK__0("Bolo"),
	DIODE_BLOCK_OFF__0("Repetidor de Redstone"),
	DIODE_BLOCK_ON__0("Repetidor de Redstone"),
	STAINED_GLASS__0("Vidro tingido de branco"),
	STAINED_GLASS__1("Vidro tingido de laranja"),
	STAINED_GLASS__2("Vidro tingido de magenta"),
	STAINED_GLASS__3("Vidro tingido de azul claro"),
	STAINED_GLASS__4("Vidro tingido de amarelo"),
	STAINED_GLASS__5("Vidro tingido de verde lim�o"),
	STAINED_GLASS__6("Vidro tingido de rosa"),
	STAINED_GLASS__7("Vidro tingido de cinza"),
	STAINED_GLASS__8("Vidro tingido de cinza claro"),
	STAINED_GLASS__9("Vidro tingido de ciano"),
	STAINED_GLASS__10("Vidro tingido de lil�s"),
	STAINED_GLASS__11("Vidro tingido de azul"),
	STAINED_GLASS__12("Vidro tingido de marrom"),
	STAINED_GLASS__13("Vidro tingido de verde"),
	STAINED_GLASS__14("Vidro tingido de vermelho"),
	STAINED_GLASS__15("Vidro tingido de preto"),
	LOCKED_CHEST__0("Ba� trancado"),
	TRAP_DOOR__0("Al�ap�o de madeira"),
	MONSTER_EGGS__0("Ovo de monstro de pedra"),
	MONSTER_EGGS__1("Ovo de monstro de pedregulho"),
	MONSTER_EGGS__2("Ovo de monstro de tijolos de pedra"),
	MONSTER_EGGS__3("Ovo de monstro de tijolos de pedra com musgo"),
	MONSTER_EGGS__4("Ovo de monstro de tijolos de pedra rachados"),
	MONSTER_EGGS__5("Ovo de monstro de tijolos de pedra talhados"),
	SMOOTH_BRICK__0("Tijolos de pedra"),
	SMOOTH_BRICK__1("Tijolos de pedra com musgo"),
	SMOOTH_BRICK__2("Tijolos de pedra rachados"),
	SMOOTH_BRICK__3("Tijolos de pedra talhados"),
	HUGE_MUSHROOM_1__0("Bloco de cogumelo"),
	HUGE_MUSHROOM_2__0("Bloco de cogumelo"),
	IRON_FENCE__0("Barras de ferro"),
	THIN_GLASS__0("Painel de vidro"),
	MELON_BLOCK__0("Melancia"),
	PUMPKIN_STEM__0("Planta��o de ab�bora"),
	MELON_STEM__0("Planta��o de melancia"),
	VINE__0("Vinhas"),
	FENCE_GATE__0("Port�o de carvalho"),
	BRICK_STAIRS__0("Escadas de tijolos"),
	SMOOTH_STAIRS__0("Escadas de tijolos de pedra"),
	MYCEL__0("Mic�lio"),
	WATER_LILY__0("Vit�ria-R�gia"),
	NETHER_BRICK__0("Tijolos do Nether"),
	NETHER_FENCE__0("Cerca de tijolos do Nether"),
	NETHER_BRICK_STAIRS__0("Escadas de tijolos do Nether"),
	NETHER_WARTS__0("Planta��o de fungo do Nether"),
	ENCHANTMENT_TABLE__0("Mesa de encantamentos"),
	BREWING_STAND__0("Suporte de po��es"), 
	CAULDRON__0("Caldeir�o"),
	ENDER_PORTAL__0("Portal"),
	ENDER_PORTAL_FRAME__0("Portal do fim"),
	ENDER_STONE__0("Pedra do fim"),
	DRAGON_EGG__0("Ovo do drag�o"),
	REDSTONE_LAMP_OFF__0("L�mpada de redstone"),
	REDSTONE_LAMP_ON__0("L�mpada de redstone"),
	WOOD_DOUBLE_STEP__0("Laje dupla de carvalho"), 
	WOOD_DOUBLE_STEP__1("Laje dupla de pinheiro"), 
	WOOD_DOUBLE_STEP__2("Laje dupla de eucalipto"), 
	WOOD_DOUBLE_STEP__3("Laje dupla de madeira da selva"), 
	WOOD_DOUBLE_STEP__4("Laje dupla de ac�cia"), 
	WOOD_DOUBLE_STEP__5("Laje dupla de carvalho escuro"), 
	WOOD_STEP__0("Laje de carvalho"), 
	WOOD_STEP__1("Laje de pinheiro"), 
	WOOD_STEP__2("Laje de eucalipto"), 
	WOOD_STEP__3("Laje de madeira da selva"), 
	WOOD_STEP__4("Laje de ac�cia"), 
	WOOD_STEP__5("Laje de carvalho escuro"), 
	COCOA__0("Cacau"),
	SANDSTONE_STAIRS__0("Escadas de arenito"),
	EMERALD_ORE__0("Min�rio de esmeralda"),
	ENDER_CHEST__0("Ba� do fim"),
	TRIPWIRE_HOOK__0("Gancho de armadilha"),
	TRIPWIRE__0("Gancho de armadilha"), 
	EMERALD_BLOCK__0("Bloco de esmeralda"),
	SPRUCE_WOOD_STAIRS__0("Escadas de pinheiro"),
	BIRCH_WOOD_STAIRS__0("Escadas de eucalipto"),
	JUNGLE_WOOD_STAIRS__0("Escadas de madeira da selva"),
	COMMAND__0("Bloco de comando"),
	BEACON__0("Sinalizador"),
	COBBLE_WALL__0("Parede de pedregulho"),
	COBBLE_WALL__1("Parede de pedregulho com musgo"),
	FLOWER_POT__0("Vaso de flor"),
	CARROT__0("Planta��o de cenouras"),
	POTATO__0("Planta��o de batatas"),
	WOOD_BUTTON__0("Bot�o"),
	SKULL__0("Cabe�a"),
	ANVIL__0("Bigorna"), 
	ANVIL__1("Bigorna ligeiramente danificada"), 
	ANVIL__2("Bigorna muito danificada"), 
	TRAPPED_CHEST__0("Ba� com armadilha"),
	GOLD_PLATE__0("Placa de press�o de pesagem (leve)"),
	IRON_PLATE__1("Placa de press�o de pesagem (pesada)"),
	REDSTONE_COMPARATOR_OFF__0("Comparador de redstone"),
	REDSTONE_COMPARATOR_ON__0("Comparador de redstone"),
	DAYLIGHT_DETECTOR__0("Sensor de luz solar"),
	REDSTONE_BLOCK__0("Bloco de redstone"),
	QUARTZ_ORE__0("Min�rio de quartzo"),
	HOPPER__0("Funil"),
	QUARTZ_BLOCK__0("Bloco de quartzo"),
	QUARTZ_BLOCK__1("Bloco de quartzo talhado"),
	QUARTZ_BLOCK__2("Pilar de quartzo"),
	QUARTZ_STAIRS__0("Escadas de quartzo"),
	ACTIVATOR_RAIL("Trilho ativador"),
	DROPPER("Liberador"),
	STAINED_CLAY__0("Argila tingida de branco"),
	STAINED_CLAY__1("Argila tingida de laranja"),
	STAINED_CLAY__2("Argila tingida de magenta"),
	STAINED_CLAY__3("Argila tingida de azul claro"),
	STAINED_CLAY__4("Argila tingida de amarelo"),
	STAINED_CLAY__5("Argila tingida de verde lim�o"),
	STAINED_CLAY__6("Argila tingida de rosa"),
	STAINED_CLAY__7("Argila tingida de cinza"),
	STAINED_CLAY__8("Argila tingida de cinza claro"),
	STAINED_CLAY__9("Argila tingida de ciano"),
	STAINED_CLAY__10("Argila tingida de lil�s"),
	STAINED_CLAY__11("Argila tingida de azul"),
	STAINED_CLAY__12("Argila tingida de marrom"),
	STAINED_CLAY__13("Argila tingida de verde"),
	STAINED_CLAY__14("Argila tingida de vermelho"),
	STAINED_CLAY__15("Argila tingida de preto"),
	STAINED_GLASS_PANE__0("Painel de vidro tingido de branco"),
	STAINED_GLASS_PANE__1("Painel de vidro tingido de laranja"),
	STAINED_GLASS_PANE__2("Painel de vidro tingido de magenta"),
	STAINED_GLASS_PANE__3("Painel de vidro tingido de azul claro"),
	STAINED_GLASS_PANE__4("Painel de vidro tingido de amarelo"),
	STAINED_GLASS_PANE__5("Painel de vidro tingido de verde lim�o"),
	STAINED_GLASS_PANE__6("Painel de vidro tingido de rosa"),
	STAINED_GLASS_PANE__7("Painel de vidro tingido de cinza"),
	STAINED_GLASS_PANE__8("Painel de vidro tingido de cinza claro"),
	STAINED_GLASS_PANE__9("Painel de vidro tingido de ciano"),
	STAINED_GLASS_PANE__10("Painel de vidro tingido de lil�s"),
	STAINED_GLASS_PANE__11("Painel de vidro tingido de azul"),
	STAINED_GLASS_PANE__12("Painel de vidro tingido de marrom"),
	STAINED_GLASS_PANE__13("Painel de vidro tingido de verde"),
	STAINED_GLASS_PANE__14("Painel de vidro tingido de vermelho"),
	STAINED_GLASS_PANE__15("Painel de vidro tingido de preto"),
	LEAVES_2__0("Folhas de ac�cia"),
	LEAVES_2__1("Folhas de carvalho escuro"),
	LOG_2__0("Madeira de ac�cia"),
	LOG_2__1("Madeira de carvalho escuro"),
	ACACIA_STAIRS__0("Escadas de ac�cia"),
	DARK_OAK_STAIRS__0("Escadas de carvalho escuro"),
	SLIME_BLOCK__0("Bloco de slime"),
	BARRIER__0("Barreira"),
	IRON_TRAPDOOR__0("Al�ap�o de ferro"),
	PRISMARINE__0("Prismarinho"),
	PRISMARINE__1("Tijolos de prismarinho"),
	PRISMARINE__2("Prismarinho escuro"),
	SEA_LANTERN__0("Lanterna do mar"),
	HAY_BLOCK__0("Fardo de feno"),
	CARPET__0("Carpete"),
	CARPET__1("Carpete laranja"),
	CARPET__2("Carpete magenta"),
	CARPET__3("Carpete azul claro"),
	CARPET__4("Carpete amarelo"),
	CARPET__5("Carpete verde lim�o"),
	CARPET__6("Carpete rosa"),
	CARPET__7("Carpete cinza"),
	CARPET__8("Carpete cinza claro"),
	CARPET__9("Carpete ciano"),
	CARPET__10("Carpete lil�s"),
	CARPET__11("Carpete azul"),
	CARPET__12("Carpete marrom"),
	CARPET__13("Carpete verde"),
	CARPET__14("Carpete vermelho"),
	CARPET__15("Carpete preto"),
	HARD_CLAY__0("Argila endurecida"),
	COAL_BLOCK__0("Bloco de carv�o"),
	PACKED_ICE__0("Gelo compactado"),
	DOUBLE_PLANT__0("Girassol"),
	DOUBLE_PLANT__1("Lil�s"),
	DOUBLE_PLANT__2("Grama alta"),
	DOUBLE_PLANT__3("Samambaia grande"),
	DOUBLE_PLANT__4("Roseira"),
	DOUBLE_PLANT__5("Pe�nia"),
	STANDING_BANNER__0("Estandarte"),
	WALL_BANNER__0("Estandarte"),
	DAYLIGHT_DETECTOR_INVERTED__0("Sensor de luz solar"),
	RED_SANDSTONE__0("Arenito vermelho"),
	RED_SANDSTONE__1("Arenito vermelho talhado"),
	RED_SANDSTONE__2("Arenito vermelho liso"),
	RED_SANDSTONE_STAIRS__0("Escadas de arenito vermelho"),
	DOUBLE_STONE_SLAB2__0("Laje dupla de arenito vermelho"),
	STONE_SLAB2__0("Laje de arenito vermelho"),
	SPRUCE_FENCE_GATE__0("Port�o de pinheiro"),
	BIRCH_FENCE_GATE__0("Port�o de eucalipto"),
	JUNGLE_FENCE_GATE__0("Port�o de madeira da selva"),
	DARK_OAK_FENCE_GATE__0("Port�o de carvalho escuro"),
	ACACIA_FENCE_GATE__0("Port�o de ac�cia"),
	SPRUCE_FENCE__0("Cerca de pinhero"),
	BIRCH_FENCE__0("Cerca de eucalipto"),
	JUNGLE_FENCE__0("Cerca de madeira da selva"),
	DARK_OAK_FENCE__0("Cerca de carvalho escuro"),
	ACACIA_FENCE__0("Cerca de ac�cia"),
	SPRUCE_DOOR__0("Porta de pinheiro"),
	BIRCH_DOOR__0("Porta de eucalipto"),
	JUNGLE_DOOR__0("Porta de madeira da selva"),
	ACACIA_DOOR__0("Porta de ac�cia"),
	DARK_OAK_DOOR__0("Porta de carvalho escuro"),
	END_ROD__0("L�mpada do end"),
	CHORUS_PLANT__0("Planta do coro"),
	CHORUS_FLOWER__0("Flor do coro"),
	PURPUR_BLOCK__0("Bloco de p�rpura"),
	PURPUR_PILLAR__0("Pilar de p�rpura"),
	PURPUR_STAIRS__0("Escadas de p�rpura"),
	PURPUR_DOUBLE_SLAB__0("Laje dupla de p�rpura"),
	PURPUR_SLAB__0("Laje de p�rpura"),
	END_BRICKS__0("Tijolos de pedra do fim"),
	BEETROOT_BLOCK__0("Planta��o de beterraba"), 
	GRASS_PATH__0("Caminho de grama"),
	END_GATEWAY__0("Portal do fim"), 
	COMMAND_REPEATING__0("Bloco de comando em repeti��o"),
	COMMAND_CHAIN__0("Bloco de comando em cadeia"),
	FROSTED_ICE__0("Gelo compactado"),
	MAGMA__0("Bloco de magma"),
	NETHER_WART_BLOCK__0("Bloco de fungos do Nether"),
	RED_NETHER_BRICK__0("Tijolos vermelhos do Nether"),
	BONE_BLOCK__0("Bloco de ossos"),
	STRUCTURE_VOID__0("Vazio da estrutura"), 
	OBSERVER__0("Observador"),
	WHITE_SHULKER_BOX__0("Caixa de shulker branca"),
	ORANGE_SHULKER_BOX__0("Caixa de shulker laranja"),
	MAGENTA_SHULKER_BOX__0("Caixa de shulker magenta"),
	LIGHT_BLUE_SHULKER_BOX__0("Caixa de shulker azul clara"),
	YELLOW_SHULKER_BOX__0("Caixa de shulker amarela"),
	LIME_SHULKER_BOX__0("Caixa de shulker verde lim�o"),
	PINK_SHULKER_BOX__0("Caixa de shulker rosa"),
	GRAY_SHULKER_BOX__0("Caixa de shulker cinza"),
	SILVER_SHULKER_BOX__0("Caixa de shulker cinza clara"),
	CYAN_SHULKER_BOX__0("Caixa de shulker ciano"),
	PURPLE_SHULKER_BOX__0("Caixa de shulker roxa"),
	BLUE_SHULKER_BOX__0("Caixa de shulker azul"),
	BROWN_SHULKER_BOX__0("Caixa de shulker marrom"),
	GREEN_SHULKER_BOX__0("Caixa de shulker verde"),
	RED_SHULKER_BOX__0("Caixa de shulker vermelha"),
	BLACK_SHULKER_BOX__0("Caixa de shulker preta"),
	WHITE_GLAZED_TERRACOTTA__0("Azulejo branco"),
	ORANGE_GLAZED_TERRACOTTA__0("Azulejo laranja"),
	MAGENTA_GLAZED_TERRACOTTA__0("Azulejo magenta"),
	LIGHT_BLUE_GLAZED_TERRACOTTA__0("Azulejo azul claro"),
	YELLOW_GLAZED_TERRACOTTA__0("Azulejo amrelo"),
	LIME_GLAZED_TERRACOTTA__0("Azulejo verde lim�o"),
	PINK_GLAZED_TERRACOTTA__0("Azulejo rosa"),
	GRAY_GLAZED_TERRACOTTA__0("Azulejo cinza"),
	SILVER_GLAZED_TERRACOTTA__0("Azulejo cinza claro"),
	CYAN_GLAZED_TERRACOTTA__0("Azulejo ciano"),
	PURPLE_GLAZED_TERRACOTTA__0("Azulejo roxo"),
	BLUE_GLAZED_TERRACOTTA__0("Azulejo azul"),
	BROWN_GLAZED_TERRACOTTA__0("Azulejo marrom"),
	GREEN_GLAZED_TERRACOTTA__0("Azulejo verde"),
	RED_GLAZED_TERRACOTTA__0("Azulejo vermelho"),
	BLACK_GLAZED_TERRACOTTA__0("Azulejo preto"),
	CONCRETE__0("Concreto branco"),
	CONCRETE__1("Concreto laranja"),
	CONCRETE__2("Concreto magenta"),
	CONCRETE__3("Concreto azul claro"),
	CONCRETE__4("Concreto amarelo"),
	CONCRETE__5("Concreto verde lim�o"),
	CONCRETE__6("Concreto rosa"),
	CONCRETE__7("Concreto cinza"),
	CONCRETE__8("Concreto cinza claro"),
	CONCRETE__9("Concreto ciano"),
	CONCRETE__10("Concreto roxo"),
	CONCRETE__11("Concreto azul"),
	CONCRETE__12("Concreto marrom"),
	CONCRETE__13("Concreto verde"),
	CONCRETE__14("Concreto vermelho"),
	CONCRETE__15("Concreto preto"),
	CONCRETE_POWDER__0("Cimento branco"),
	CONCRETE_POWDER__1("Cimento laranja"),
	CONCRETE_POWDER__2("Cimento magenta"),
	CONCRETE_POWDER__3("Cimento azul claro"),
	CONCRETE_POWDER__4("Cimento amarelo"),
	CONCRETE_POWDER__5("Cimento verde lim�o"),
	CONCRETE_POWDER__6("Cimento rosa"),
	CONCRETE_POWDER__7("Cimento cinza"),
	CONCRETE_POWDER__8("Cimento cinza claro"),
	CONCRETE_POWDER__9("Cimento ciano"),
	CONCRETE_POWDER__10("Cimento roxo"),
	CONCRETE_POWDER__11("Cimento azul"),
	CONCRETE_POWDER__12("Cimento marrom"),
	CONCRETE_POWDER__13("Cimento verde"),
	CONCRETE_POWDER__14("Cimento vermelho"),
	CONCRETE_POWDER__15("Cimento preto"),
	STRUCTURE_BLOCK__0("Bloco de estrutura"), // 255
	IRON_SPADE__0("P� de ferro"),
	IRON_PICKAXE__0("Picareta de ferro"),
	IRON_AXE__0("Machado de ferro"),
	FLINT_AND_STEEL__0("Isqueiro"),
	APPLE__0("Ma�a"),
	BOW__0("Arco"),
	ARROW__0("Flecha"),
	COAL__0("Carv�o"),
	COAL__1("Carv�o vegetal"),
	DIAMOND__0("Diamante"),
	IRON_INGOT__0("Barra de ferro"),
	GOLD_INGOT__0("Barra de ouro"),
	IRON_SWORD__0("Espada de ferro"),
	WOOD_SWORD__0("Espara de madeira"),
	WOOD_SPADE__0("P� de madeira"),
	WOOD_PICKAXE__0("Picareta de madeira"),
	WOOD_AXE__0("Machado de madeira"),
	STONE_SWORD__0("Espada de pedra"),
	STONE_SPADE__0("P� de pedra"),
	STONE_PICKAXE__0("Picareta de pedra "),
	STONE_AXE__0("Machado de pedra"),
	DIAMOND_SWORD__0("Espada de diamante"),
	DIAMOND_SPADE__0("P� de diamante"),
	DIAMOND_PICKAXE__0("Picareta de diamante"),
	DIAMOND_AXE__0("Machado de diamante"),
	STICK__0("Graveto"),
	BOWL__0("Tigela"),
	MUSHROOM_SOUP__0("Ensopado de cogumelos"),
	GOLD_SWORD__0("Espada de ouro"),
	GOLD_SPADE__0("P� de ouro"),
	GOLD_PICKAXE__0("Picareta de ouro"),
	GOLD_AXE__0("Machado de ouro"),
	STRING__0("Linha"),
	FEATHER__0("Pena"),
	SULPHUR__0("P�lvora"),
	WOOD_HOE__0("Enxada de madeira"),
	STONE_HOE__0("Enxada de pedra"),
	IRON_HOE__0("Enxada de ferro"),
	DIAMOND_HOE__0("Enxada de diamante"),
	GOLD_HOE__0("Enxada de ouro"),
	SEEDS__0("Sementes"),
	WHEAT__0("Trigo"),
	BREAD__0("P�o"),
	LEATHER_HELMET__0("Capuz de couro"),
	LEATHER_CHESTPLATE__0("T�nica de couro"),
	LEATHER_LEGGINGS__0("Cal�as de couro"),
	LEATHER_BOOTS__0("Botas de couro"),
	CHAINMAIL_HELMET__0("Capacete de cota de malha"),
	CHAINMAIL_CHESTPLATE__0("Peitoral de cota de malha"),
	CHAINMAIL_LEGGINGS__0("Cal�as de cota de malha"),
	CHAINMAIL_BOOTS__0("Botas de cota de malha"),
	IRON_HELMET__0("Capacete de ferro"),
	IRON_CHESTPLATE__0("Peitoral de ferro"),
	IRON_LEGGINGS__0("Cal�as de ferro"),
	IRON_BOOTS__0("Botas de ferro"),
	DIAMOND_HELMET__0("Capacete de diamante"),
	DIAMOND_CHESTPLATE__0("Peitoral de diamante"),
	DIAMOND_LEGGINGS__0("Cal�as de diamante"),
	DIAMOND_BOOTS__0("Botas de diamante"),
	GOLD_HELMET__0("Capacete de ouro"),
	GOLD_CHESTPLATE__0("Peitoral de ouro"),
	GOLD_LEGGINGS__0("Cal�as de ouro"),
	GOLD_BOOTS__0("Botas de ouro"),
	FLINT__0("Pederneira"),
	PORK__0("Carne de porco crua"),
	GRILLED_PORK__0("Carne de porco assada"),
	PAINTING__0("Pintura"),
	GOLDEN_APPLE__0("Ma�a dourada"),
	GOLDEN_APPLE__1("Ma�a dourada"),
	SIGN__0("Placa"),
	WOOD_DOOR__0("Porta de carvalho"),
	BUCKET__0("Balde"),
	WATER_BUCKET__0("Balde de �gua"),
	LAVA_BUCKET__0("Balde de lava"),
	MINECART__0("Carrinho"),
	SADDLE__0("Sela"),
	IRON_DOOR__0("Porta de ferro"),
	REDSTONE__0("Redstone"),
	SNOW_BALL__0("Bola de neve"),
	BOAT__0("Bote"),
	LEATHER__0("Couro"),
	MILK_BUCKET__0("Balde de leite"),
	CLAY_BRICK__0("Tijolo"),
	CLAY_BALL__0("Argila"),
	SUGAR_CANE__0("Canas de a�ucar"),
	PAPER__0("Papel"),
	BOOK__0("Livro"),
	SLIME_BALL__0("Gosma de slime"),
	STORAGE_MINECART__0("Carrinho com ba�"),
	POWERED_MINECART__0("Carrinho com fornalha"),
	EGG__0("Ovo"),
	COMPASS__0("B�ssola"),
	FISHING_ROD__0("Vara de pescar"),
	WATCH__0("Rel�gio"),
	GLOWSTONE_DUST__0("P� de pedra luminosa"),
	RAW_FISH__0("Peixe cru"),
	RAW_FISH__1("Salm�o cru"),
	RAW_FISH__2("Peixe-palha�o"),
	RAW_FISH__3("Baiacu"),
	COOKED_FISH__0("Peixe assado"),
	COOKED_FISH__1("Salm�o assado"),
	INK_SACK__0("Bolsa de tinta"),
	INK_SACK__1("Vermelho da rosa"),
	INK_SACK__2("Verde do cacto"),
	INK_SACK__3("Sementes de cacau"),
	INK_SACK__4("L�pis-laz�li"),
	INK_SACK__5("Corante lil�s"),
	INK_SACK__6("Corante ciano"),
	INK_SACK__7("Corante cinza claro"),
	INK_SACK__8("Corante cinza"),
	INK_SACK__9("Corante rosa"),
	INK_SACK__10("Corante verde lim�o"),
	INK_SACK__11("Amarelo do dente-de-le�o"),
	INK_SACK__12("Corante azul claro"),
	INK_SACK__13("Corante magenta"),
	INK_SACK__14("Corante laranja"),
	INK_SACK__15("Farinha de osso"),
	BONE__0("Osso"),
	SUGAR__0("A��car"),
	CAKE__0("Bolo"),
	BED__0("Cama"),
	DIODE__0("Repetidor de redstone"),
	COOKIE__0("Biscoito"),
	MAP__0("Mapa"),
	SHEARS__0("Tesour�o"),
	MELON__0("Melancia"),
	PUMPKIN_SEEDS__0("Sementes de ab�bora"),
	MELON_SEEDS__0("Sementes de melancia"),
	RAW_BEEF__0("Bife cru"),
	COOKED_BEEF__0("Fil�"),
	RAW_CHICKEN__0("Frango cru"),
	COOKED_CHICKEN__0("Frango assado"),
	ROTTEN_FLESH__0("Carne podre"),
	ENDER_PEARL__0("P�rola do fim"),
	BLAZE_ROD__0("Vara incandescente"),
	GHAST_TEAR__0("L�grima de ghast"),
	GOLD_NUGGET__0("Pepita de ouro"),
	NETHER_STALK__0("Fungo do nether"),
	POTION__0("Po��o"),
	GLASS_BOTTLE__0("Frasco de vidro"),
	SPIDER_EYE__0("Olho de aranha"),
	FERMENTED_SPIDER_EYE__0("Olho de aranha fermentado"),
	BLAZE_POWDER__0("P� de blaze"),
	MAGMA_CREAM__0("Creme de magma"),
	BREWING_STAND_ITEM__0("Suporte de po��es"),
	CAULDRON_ITEM__0("Caldeir�o"),
	EYE_OF_ENDER__0("Olho do fim"),
	SPECKLED_MELON__0("Melancia reluzente"),
	MONSTER_EGG__0("Ovo de monstro"),
	EXP_BOTTLE__0("Frasco de experi�ncia"),
	FIREBALL__0("Bola de fogo"),
	BOOK_AND_QUILL__0("Pena e livro"),
	WRITTEN_BOOK__0("Livro escrito"),
	EMERALD__0("Esmeralda"),
	ITEM_FRAME__0("Moldura"),
	FLOWER_POT_ITEM__0("Vaso de flor"),
	CARROT_ITEM__0("Cenoura"),
	POTATO_ITEM__0("Batata"),
	BAKED_POTATO__0("Batata assada"),
	POISONOUS_POTATO__0("Batata venenosa"),
	EMPTY_MAP__0("Mapa em branco"),
	GOLDEN_CARROT__0("Cenoura dourada"),
	SKULL_ITEM__0("Cr�nio de esqueleto"),
	SKULL_ITEM__1("Cr�nio de esqueleto whiter"),
	SKULL_ITEM__2("Cabe�a de zumbi"),
	SKULL_ITEM__3("Cabe�a"),
	SKULL_ITEM__4("Cabe�a de creeper"),
	SKULL_ITEM__5("Cabe�a de drag�o"),
	CARROT_STICK__0("Vara de pesca com cenoura"),
	NETHER_STAR__0("Estrela do Nether"),
	PUMPKIN_PIE__0("Torta de ab�bora"),
	FIREWORK__0("Fogos de artif�cio"),
	FIREWORK_CHARGE__0("Estrela de fogos de artif�cio"),
	ENCHANTED_BOOK__0("Livro encantado"),
	REDSTONE_COMPARATOR__0("Comparador de redstone"),
	NETHER_BRICK_ITEM__0("Tijolo do Nether"),
	QUARTZ__0("Quartzo do Nether"),
	EXPLOSIVE_MINECART__0("Carrinho com dinamite"),
	HOPPER_MINECART__0("Carrinho com funil"),
	PRISMARINE_SHARD__0("Fragmento de prismarinho"),
	PRISMARINE_CRYSTALS__0("Cristais de prismarinho"),
	RABBIT__0("Coelho cru"),
	COOKED_RABBIT__0("Coelho assado"),
	RABBIT_STEW__0("Ensopado de coelho"),
	RABBIT_FOOT__0("P� de coelho"),
	RABBIT_HIDE__0("Pele de coelho"),
	ARMOR_STAND__0("Suporte de Armaduras"),
	IRON_BARDING__0("Armadura de ferro para cavalo"),
	GOLD_BARDING__0("Armadura de ouro para cavalo"),
	DIAMOND_BARDING__0("Armadura de diamante para cavalo"),
	LEASH__0("La�o"),
	NAME_TAG__0("Etiqueta"),
	COMMAND_MINECART__0("Carrinho com bloco de comando"),
	MUTTON__0("Carneiro cru"),
	COOKED_MUTTON__0("Carneiro assado"),
	BANNER__0("Estandarte preto"),
	BANNER__1("Estandarte vermelho"),
	BANNER__2("Estandarte verde"),
	BANNER__3("Estandarte marrom"),
	BANNER__4("Estandarte azul"),
	BANNER__5("Estandarte lil�s"),
	BANNER__6("Estandarte ciano"),
	BANNER__7("Estandarte cinza claro"),
	BANNER__8("Estandarte cinza"),
	BANNER__9("Estandarte rosa"),
	BANNER__10("Estandarte verde lim�o"),
	BANNER__11("Estandarte amarelo"),
	BANNER__12("Estandarte azul claro"),
	BANNER__13("Estandarte magenta"),
	BANNER__14("Estandarte laranja"),
	BANNER__15("Estandarte branco"),
	END_CRYSTAL__0("Cristal do end"),
	SPRUCE_DOOR_ITEM__0("Porta de pinheiro"),
	BIRCH_DOOR_ITEM__0("Porta de eucalipto"),
	JUNGLE_DOOR_ITEM__0("Porta de madeira da selva"),
	ACACIA_DOOR_ITEM__0("Porta de ac�cia"),
	DARK_OAK_DOOR_ITEM__0("Porta de carvalho escuro"),
	CHORUS_FRUIT__0("Fruta do coro"),
	CHORUS_FRUIT_POPPED__0("Fruta do coro estourada"),
	BEETROOT__0("Beterraba"),
	BEETROOT_SEEDS__0("Sementes de beterraba"),
	BEETROOT_SOUP__0("Sopa de beterraba"),
	DRAGONS_BREATH__0("Bafo de drag�o"),
	SPLASH_POTION__0("Po��o arremess�vel"),
	SPECTRAL_ARROW__0("Flecha espectral"),
	TIPPED_ARROW__0("Flecha especial"),
	LINGERING_POTION__0("Po��o prolongada"),
	SHIELD__0("Escudo"),
	ELYTRA__0("�litros"),
	BOAT_SPRUCE__0("Bote de pinheiro"),
	BOAT_BIRCH__0("Bote eucalipto"),
	BOAT_JUNGLE__0("Bote de madeira da selva"),
	BOAT_ACACIA__0("Bote de ac�cia"),
	BOAT_DARK_OAK__0("Bote de carvalho escuro"),
	TOTEM__0("Totem da imortalidade"),
	SHULKER_SHELL__0("Casco de shulker"),
	IRON_NUGGET__0("Pepita de ferro"),
	KNOWLEDGE_BOOK__0("Livro do conhecimento"),
	GOLD_RECORD__0("Disco de m�sica"),
	GREEN_RECORD__0("Disco de m�sica"),
	RECORD_3__0("Disco de m�sica"),
	RECORD_4__0("Disco de m�sica"),
	RECORD_5__0("Disco de m�sica"),
	RECORD_6__0("Disco de m�sica"),
	RECORD_7__0("Disco de m�sica"),
	RECORD_8__0("Disco de m�sica"),
	RECORD_9__0("Disco de m�sica"),
	RECORD_10__0("Disco de m�sica"),
	RECORD_11__0("Disco de m�sica"),
	RECORD_12__0("Disco de m�sica");
	
	private String name;
		
	ItemName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static ItemName valueOf(ItemStack item) {
		try {
			return ItemName.valueOf(item.getType().name() + "__" + item.getDurability());
		} catch (Exception | Error e) {
			return ItemName.valueOf(item.getType().name() + "__0");
		}
	}
	
	public static ItemName valueOf(String name, short durability) {
		try {
			return ItemName.valueOf(name + "__" + durability);
		} catch (Exception | Error e) {
			return ItemName.valueOf(name + "__0");
		}
	}
	
	public static ItemName valueOf(String name, byte data) {
		try {
			return ItemName.valueOf(name + "__" + data);
		} catch (Exception | Error e) {
			return ItemName.valueOf(name + "__0");
		}
	}
	
	public static ItemName valueOf(Material material, byte data) {
		try {
			return ItemName.valueOf(material.name() + "__" + data);
		} catch (Exception | Error e) {
			return ItemName.valueOf(material.name() + "__0");
		}
	}
	
	public static ItemName valueOf(Material material) {
		return ItemName.valueOf(material.name() + "__0");
	}
	
	public static ItemName valueOf(Item item) {
		return ItemName.valueOf(item.getItemStack());
	}

	public static ItemName valueOf(Block block) {
		return ItemName.valueOf(block.getType(), block.getData());
	}
	
}