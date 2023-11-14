package Classes.Projects;

import Classes.Project;

public class Residential extends Project
{
  private double size;
  private int numberOfKitchens;
  private int numberOfBathrooms;
  private int numberOfPlummingRooms;
  private boolean isNewBuild;

  public Residential(double budget, int timeline, double size,
      int numberOfKitchens, int numberOfBathrooms, int numberOPlummingRooms)
  {
    super(budget, timeline);
    this.size = size;
    this.numberOfKitchens = numberOfKitchens;
    this.numberOfBathrooms = numberOfBathrooms;
    this.numberOfPlummingRooms = numberOPlummingRooms;
    this.isNewBuild = true;
  }
  public double getSize()
  {
    return size;
  }

  public void setSize(double size)
  {
    this.size = size;
  }

  public int getNumberOfKitchens()
  {
    return numberOfKitchens;
  }

  public void setNumberOfKitchens(int numberOfKitchens)
  {
    this.numberOfKitchens = numberOfKitchens;
  }

  public int getNumberOfBathrooms()
  {
    return numberOfBathrooms;
  }

  public void setNumberOfBathrooms(int numberOfBathrooms)
  {
    this.numberOfBathrooms = numberOfBathrooms;
  }

  public int getNumberOfPlummingRooms()
  {
    return numberOfPlummingRooms;
  }

  public void setNumberOfPlummingRooms(int numberOfPlummingRooms)
  {
    this.numberOfPlummingRooms = numberOfPlummingRooms;
  }

  public boolean isNewBuild()
  {
    return isNewBuild;
  }

  public void setNewBuild(boolean newBuild)
  {
    isNewBuild = newBuild;
  }

}
