package net.callmeari.intromod.item;
import net.callmeari.intromod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab INTRO_TAB = new CreativeModeTab("introtab"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PYKRETE.get());
        }
    };
}