package me.i509.fabric.creativetabkeymap;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.fabricmc.fabric.impl.itemgroup.CreativeGuiExtensions;
import net.fabricmc.fabric.impl.itemgroup.FabricCreativeGuiComponents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.util.InputUtil.Type;
import net.minecraft.util.Identifier;

public class CTMappingMod implements ClientModInitializer {
    
    private static CTMappingMod INSTANCE;
    
    public final FabricKeyBinding creativeTabPgLeft = FabricKeyBinding.Builder.create(new Identifier("ctampping", "page_left"), Type.KEYSYM, GLFW.GLFW_KEY_LEFT, "Creative Tab Keybindings").build();
    
    public final FabricKeyBinding creativeTabPgRight = FabricKeyBinding.Builder.create(new Identifier("ctampping", "page_right"), Type.KEYSYM, GLFW.GLFW_KEY_RIGHT, "Creative Tab Keybindings").build();
    
    public static CTMappingMod getInstance() {
        if(INSTANCE == null) {
            throw new RuntimeException("Accessed Instance too early");
        }
        return INSTANCE;
    }

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        
        
        KeyBindingRegistry reg = KeyBindingRegistry.INSTANCE;
        
        reg.addCategory("Creative Tab Keybindings");
        reg.register(creativeTabPgLeft);
        reg.register(creativeTabPgRight);
    }

    public void handleInputR() {
        if(MinecraftClient.getInstance().currentScreen instanceof CreativeInventoryScreen) { // Can't be too unsure
            CreativeGuiExtensions wrappedScreen = (CreativeGuiExtensions) MinecraftClient.getInstance().currentScreen;
            
            if (wrappedScreen.fabric_isButtonVisible(FabricCreativeGuiComponents.Type.NEXT)) {
                if(wrappedScreen.fabric_isButtonEnabled(FabricCreativeGuiComponents.Type.NEXT)) {
                    wrappedScreen.fabric_nextPage();
                }
            }
        }
    }

    public void handleInputL() {
        if(MinecraftClient.getInstance().currentScreen instanceof CreativeInventoryScreen) {
            CreativeGuiExtensions wrappedScreen = (CreativeGuiExtensions) MinecraftClient.getInstance().currentScreen;
            
            if (wrappedScreen.fabric_isButtonVisible(FabricCreativeGuiComponents.Type.PREVIOUS)) {
                if(wrappedScreen.fabric_isButtonEnabled(FabricCreativeGuiComponents.Type.PREVIOUS)) {
                    wrappedScreen.fabric_previousPage();
                }
            }
        }
    }

}
