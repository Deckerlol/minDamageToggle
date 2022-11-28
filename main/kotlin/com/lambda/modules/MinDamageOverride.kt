package com.lambda.modules

import com.lambda.FelonyPlugin
import com.lambda.client.module.Category
import com.lambda.client.plugin.api.PluginModule
import com.lambda.client.util.text.MessageSendHelper.sendServerMessage
import com.lambda.client.util.threads.safeListener
import com.lambda.client.util.combat.CombatUtils
import com.lambda.client.util.combat.CombatUtils.equipBestWeapon
import com.lambda.client.util.items.hotbarSlots
import com.lambda.client.util.items.swapToSlot
import com.lambda.client.util.text.MessageSendHelper.sendChatMessage
import com.lambda.client.util.threads.safeListener
import net.minecraft.block.state.IBlockState
import net.minecraft.enchantment.EnchantmentHelper
import net.minecraft.entity.EntityLivingBase
import net.minecraft.init.Enchantments
import net.minecraftforge.event.entity.player.PlayerInteractEvent
import net.minecraftforge.fml.common.gameevent.TickEvent
import org.lwjgl.input.Mouse
import net.minecraft.client.Minecraft
import net.minecraft.util.text.ITextComponent
import net.minecraftforge.client.event.RenderGameOverlayEvent
import net.minecraftforge.fml.common.eventhandler.Event
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent
import org.lwjgl.opengl.Display


internal object MinDamageOverride : PluginModule(
    name = "minDamageOverride",
    category = Category.COMBAT,
    description = "toggles alternate min damage for future crystal aura",
    pluginMain = FelonyPlugin
) {
    private val futureMinDamage by setting("FutureMinDamage", 8, 0..20, 1)
    init{

        onEnable { Minecraft.getMinecraft().player.sendChatMessage(".autocrystal mindamage 0.7") }
        onDisable { Minecraft.getMinecraft().player.sendChatMessage(".autocrystal mindamage $futureMinDamage") }

    }



}

