/*
 * MIT License
 *
 * Copyright (c) i509VCB<git@i509.me>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.i509.fabric.creativekeybinds;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.util.InputUtil.Type;
import net.minecraft.util.Identifier;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;

public final class CreativeKeybindsMod implements ClientModInitializer {
	public static final FabricKeyBinding CREATIVE_TAB_PG_LEFT = FabricKeyBinding.Builder.create(new Identifier("creativekeybinds", "page_left"), Type.KEYSYM, GLFW.GLFW_KEY_LEFT, "Creative Keybindings").build();
	public static final FabricKeyBinding CREATIVE_TAB_PG_RIGHT = FabricKeyBinding.Builder.create(new Identifier("creativekeybinds", "page_right"), Type.KEYSYM, GLFW.GLFW_KEY_RIGHT, "Creative Keybindings").build();

	@Override
	public void onInitializeClient() {
	}
}
