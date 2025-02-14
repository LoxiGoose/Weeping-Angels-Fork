package mc.craig.software.angels.common.items.forge;

import mc.craig.software.angels.WeepingAngels;
import mc.craig.software.angels.common.items.WAItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WAItemsImpl {

    public static CreativeModeTab TAB = new CreativeModeTab(WeepingAngels.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(WAItems.TIMEY_WIMEY_DETECTOR.get());
        }
    };

    public static CreativeModeTab getCreativeTab() {
        return TAB;
    }


}
