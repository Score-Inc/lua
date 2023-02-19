function Update()
    if CS.UnityEngine.Time.timeScale == 1.0 then
      CS.UnityEngine.Time.timeScale = 0.10
    else
      CS.UnityEngine.Time.timeScale = 1.0
    end
  end
Update()