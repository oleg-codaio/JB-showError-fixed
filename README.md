Android Jelly Bean 4.2/4.2.1 fix for `EditText.setError`
=================

Unfortunately JB has a bug with `setError()` discussed on [StackOverflow](http://stackoverflow.com/questions/13756978/android-os-bug-with-some-devices-running-jelly-bean-4-2-1-textview-seterrorch) and [Google Code](http://code.google.com/p/android/issues/detail?id=40417).

Fortunately it can be addressed using reflection as a dirty workaround, using `EditTextErrorFixed` in place of `EditText`. Tested to work with both 4.2 and 4.2.1 and an updated Galaxy Nexus.

![Screenshot](http://i.stack.imgur.com/WSMhR.png)

The screenshot shows that the icon on the bottom `EditTextErrorFixed` persists even if the focus changes. In addition it incorporates another fix where if the user presses Delete on an already empty `EditText` the error disappears (another bug?).
