Add your SWT resources here.

Create a folder with OS name (os.name) and a subfolder with Arch name (os.arch)
Use System.getProperty("os.name") and System.getProperty("os.arch") to discover
your OS and Arch. It's not needed to use the OS full name. e.g.:Windows XP, can be Windows
Arch is optional.


Example:

Put SWT for Windows/x86 in the folder:

-Windows
  -x86
     +swt.jar
     +swt-awt-win32-3232.dll
     +swt-gdip-win32-3232.dll
     +swt-wgl-win32-3232.dll
     +swt-win32-3232.dll


For Linux
-Linux
   +libcairo-swt.so
   +libswt-atk-gtk-3232.so
   +libswt-awt-gtk-3232.so
   +libswt-cairo-gtk-3232.so
   +libswt-glx-gtk-3232.so
   +libswt-gnome-gtk-3232.so
   +libswt-gtk-3232.so
   +libswt-mozilla-gcc3-gtk-3232.so
   +libswt-mozilla-gtk-3232.so
   +libswt-pi-gtk-3232.so
   +swt.jar


For Linux x86_64
-Linux
   x86_64
      +libswt-atk-gtk-3232.so
      +libswt-awt-gtk-3232.so
      +libswt-cairo-gtk-3232.so
      +libswt-glx-gtk-3232.so
      +libswt-gnome-gtk-3232.so
      +libswt-gtk-3232.so
      +libswt-mozilla-gcc3-gtk-3232.so
      +libswt-pi-gtk-3232.so
      +swt.jar