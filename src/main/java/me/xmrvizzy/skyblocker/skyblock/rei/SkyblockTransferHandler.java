package me.xmrvizzy.skyblocker.skyblock.rei;

import me.shedaniel.rei.api.client.registry.transfer.TransferHandler;

public class SkyblockTransferHandler implements TransferHandler {
    @Override
    public Result handle(Context context) {
        if (!(context.getDisplay() instanceof SkyblockCraftingDisplay)) return Result.createNotApplicable();
        SkyblockCraftingDisplay display = (SkyblockCraftingDisplay) context.getDisplay();
        return Result.createSuccessful();
    }
}
