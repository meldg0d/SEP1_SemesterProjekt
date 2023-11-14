package Classes;

public abstract class Project
{
  private double budget;
  private int timeline;

  public Project(double budget, int timeline)
  {
    this.budget = budget;
    this.timeline = timeline;
  }

  public double getBudget()
  {
    return budget;
  }

  public void setBudget(double budget)
  {
    this.budget = budget;
  }

  public int getTimeline()
  {
    return timeline;
  }

  public void setTimeline(int timeline)
  {
    this.timeline = timeline;
  }
}
