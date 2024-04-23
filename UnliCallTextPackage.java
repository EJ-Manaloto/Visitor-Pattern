class UnliCallTextPackage implements UnliCallsTextOffer {

  @Override
  public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
    if (unliCallText) {
      return telcoName + " offers unlimited calls and texts.";
    } else {
      return telcoName + " does not offer unlimited calls and texts.";
    }
  }
}
