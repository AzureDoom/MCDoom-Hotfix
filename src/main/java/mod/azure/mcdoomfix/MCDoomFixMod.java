package mod.azure.mcdoomfix;

import java.io.File;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import mod.azure.doom.util.config.DoomConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("mcdoomfix")
public class MCDoomFixMod {
	public MCDoomFixMod() {
		MCDoomFixMod.loadConfig(DoomConfig.SERVER_SPEC, FMLPaths.CONFIGDIR.get().resolve("doom-newconfig.toml").toString());
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		file.load();
		config.setConfig(file);
	}
}