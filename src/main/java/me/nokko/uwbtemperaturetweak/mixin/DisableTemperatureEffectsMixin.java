package me.nokko.uwbtemperaturetweak.mixin;

import com.github.zljtt.underwaterbiome.Handlers.TemperatureHandler;
import net.minecraftforge.event.TickEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Pseudo;



@Pseudo
@Mixin(value=TemperatureHandler.class)
public class DisableTemperatureEffectsMixin {

    /**
     * No-op the suffering mechanic.
     * @reason By golly, I hope you're not writing *another* mixin for this now-quite-old 1.14.4 mod that happens
     * to alter the Temperature mechanics.
     * But if you are, I'm sorry, I used an @Overwrite and I probably shouldn't have. My excuse is that the damn
     * bytecode viewer broke in IntelliJ, it's 12:21AM, and I'm tired of this project.
     * @author nokko
     */
    @Overwrite(remap = false)
    public void onPlayerSufferColdOrHeatDamage(TickEvent.PlayerTickEvent playerTickEvent) {}
}
