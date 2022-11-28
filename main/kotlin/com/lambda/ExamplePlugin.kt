package com.lambda

import com.lambda.client.LambdaMod
import com.lambda.client.plugin.api.Plugin
import com.lambda.client.util.threads.BackgroundJob
import com.lambda.modules.MinDamageOverride
import net.minecraftforge.common.MinecraftForge

internal object FelonyPlugin : Plugin() {

    override fun onLoad() {
        modules.add(MinDamageOverride)

    }

    override fun onUnload() {

    }
}
