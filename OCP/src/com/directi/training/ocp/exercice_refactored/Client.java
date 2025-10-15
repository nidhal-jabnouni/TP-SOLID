package com.directi.training.ocp.exercice_refactored;

public class Client
{
    public static void main(String[] args)
    {
        ResourceAllocator allocator = new ResourceAllocator();

        // Allocate time slot resource
        Resource timeSlot = new TimeSlotResource();
        int timeSlotId = allocator.allocate(timeSlot);
        System.out.println("Allocated time slot with ID: " + timeSlotId);

        // Allocate space slot resource
        Resource spaceSlot = new SpaceSlotResource();
        int spaceSlotId = allocator.allocate(spaceSlot);
        System.out.println("Allocated space slot with ID: " + spaceSlotId);

        // Free resources
        allocator.free(timeSlot, timeSlotId);
        allocator.free(spaceSlot, spaceSlotId);

        // Demonstrate extensibility: Can easily add new resource types
        // without modifying ResourceAllocator
        System.out.println("\nOCP Benefit: New resource types can be added " +
                           "by implementing Resource interface");
    }
}
