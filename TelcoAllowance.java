class TelcoAllowance implements UsagePromo {

  @Override
  public String showAllowance(String telcoName, double price) {
    return telcoName + " offers " + getDataAllowance(telcoName, price) + " GB data allowance for Php " + price + " per month."; 
  }

  private int getDataAllowance(String telcoName, double price) {

    if (telcoName.equals("Smart")) 
    {
      return 15;
    } 
    else if (telcoName.equals("Globe")) 
    {
      return 10;
    } 
    else if (telcoName.equals("Ditto")) 
    {
      return 8;
    } 
    else
    {
      return 0;
    }
  }
}
