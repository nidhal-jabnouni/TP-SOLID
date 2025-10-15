package com.directi.training.ocp.exercice_refactored;

public class SpaceSlotResource implements Resource
{
    @Override
    public int allocate()
    {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId)
    {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot()
    {
        return 0;
    }

    private void markSpaceSlotBusy(int resourceId)
    {
        System.out.println("Space slot " + resourceId + " marked as busy");
    }

    private void markSpaceSlotFree(int resourceId)
    {
        System.out.println("Space slot " + resourceId + " marked as free");
    }
}
