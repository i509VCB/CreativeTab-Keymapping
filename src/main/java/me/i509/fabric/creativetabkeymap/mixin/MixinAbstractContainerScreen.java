package me.i509.fabric.creativetabkeymap.mixin;

import org.spongepowered.asm.mixin.Mixin;

import me.i509.fabric.creativetabkeymap.CTMappingMod;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.container.Container;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;

@Mixin(CreativeInventoryScreen.class)
public abstract class MixinAbstractContainerScreen extends AbstractInventoryScreen {

    public MixinAbstractContainerScreen(Container container_1, PlayerInventory playerInventory_1, Text text_1) {
        super(container_1, playerInventory_1, text_1);
    }
    
    public boolean keyPressed(int int_1, int int_2, int int_3) {
        if(CTMappingMod.getInstance().creativeTabPgLeft.matchesKey(int_1, int_2)) {
            CTMappingMod.getInstance().handleInputL();
            
        } else if (CTMappingMod.getInstance().creativeTabPgRight.matchesKey(int_1, int_2)) {
            CTMappingMod.getInstance().handleInputR();
            
        } else {
            super.keyPressed(int_1, int_2, int_3);
        }
        
        return true;
    }

}
