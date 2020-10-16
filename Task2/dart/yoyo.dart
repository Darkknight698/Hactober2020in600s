
final AnimationController c;
...
c.addStatusListener((status) {
  if (status == AnimationStatus.completed) {
    c.reverse();
  }
  else if (status == AnimationStatus.dismissed) {
    c.forward();
  }
});
