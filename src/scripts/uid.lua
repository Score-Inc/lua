uidobj = CS.UnityEngine.GameObject.Find("/BetaWatermarkCanvas(Clone)/Panel/TxtUID"):GetComponent("Text");
uid = uidobj.text;
uid = uid:gsub("UID:", "<color=#ff99ff>S</color><color=#e899ff>c</color><color=#d999ff>o</color><color=#c999ff>r</color><color=#ba99ff>e</color><color=#ab99ff>P</color><color=#9499ff>S</color> <color=#ffffff>-</color>")
uidobj.text = "<color=#cf2ad3>"..uid.."</color>"
