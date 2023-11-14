package Classes.Projects;

import Classes.Project;

public class Commercial extends Project
{
  private double size;
  private int numberOfFloors;
  private String intendedUse;

  public Commercial(double budget, int timeline, double size,
      int numberOfFloors, String intendedUse)
  {
    super(budget, timeline);
    this.size = size;
    this.numberOfFloors = numberOfFloors;
    this.intendedUse = intendedUse;
  }

  public double getSize()
  {
    return size;
  }

  public void setSize(double size)
  {
    this.size = size;
  }

  public int getNumberOfFloors()
  {
    return numberOfFloors;
  }

  public void setNumberOfFloors(int numberOfFloors)
  {
    this.numberOfFloors = numberOfFloors;
  }

  public String getIntendedUse()
  {
    return intendedUse;
  }

  public void setIntendedUse(String intendedUse)
  {
    this.intendedUse = intendedUse;
  }
}
