package de.bybackfish.revertcolorchanges.mixin;

import com.wynntils.utils.wynn.ColorScaleUtils;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@Mixin(value = ColorScaleUtils.class, remap = false)
public class ColorScaleUtillsMixin {

	@Shadow @Final
	private static NavigableMap<Float, TextColor> LERP_MAP = new TreeMap<>(Map.of(
			0.0F, TextColor.fromFormatting(Formatting.RED),
			70.0F, TextColor.fromFormatting(Formatting.YELLOW),
			90.0F, TextColor.fromFormatting(Formatting.GREEN),
			100.0F, TextColor.fromFormatting(Formatting.AQUA)));


	@Shadow @Final
	private static NavigableMap<Float, TextColor> FLAT_MAP = new TreeMap<>(Map.of(
			30.0F, TextColor.fromFormatting(Formatting.RED),
			80.0F, TextColor.fromFormatting(Formatting.YELLOW),
			96.0F, TextColor.fromFormatting(Formatting.GREEN),
			Float.MAX_VALUE, TextColor.fromFormatting(Formatting.AQUA)));

}