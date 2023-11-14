package Classes.Projects;

import Classes.Project;

public class Industrial extends Project
{
  private int size;
  private String type;

  public Industrial(double budget, int timeline, int size, String type)
  {
    super(budget, timeline);
    this.size = size;
    this.type = type;
  }

  public int getSize()
  {
    return size;
  }

  public void setSize(int size)
  {
    this.size = size;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }
}
