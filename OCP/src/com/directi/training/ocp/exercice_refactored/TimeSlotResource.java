package com.directi.training.ocp.exercice_refactored;

public class TimeSlotResource implements Resource
{
    @Override
    public int allocate()
    {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId)
    {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }

    private void markTimeSlotBusy(int resourceId)
    {
        System.out.println("Time slot " + resourceId + " marked as busy");
    }

    private void markTimeSlotFree(int resourceId)
    {
        System.out.println("Time slot " + resourceId + " marked as free");
    }
}
