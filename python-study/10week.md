# 파이썬 10주차

* tkinter

  * ```python
    from tkinter import *
    win = Tk()
    win.title("여러 위젯 구성")
    
    lbl = Label(win, text="레이블")
    lbl.pack()
    
    # ...
    win.mainloop()
    ```

  * pack()을 한 순서대로 위젯이 화면에 배치 됨

  * 이벤트 처리

    * ...

* pygame

  * 별도의 설치 필요: `pip install pygame`

  * 초기화 방법

    ```python
    import pygame
    
    # 색상 정의
    WHITE = (255, 255, 255)
    # 윈도 크기 정의
    size = (300, 200)
    
    # 윈도 초기화
    pygame.init()
    
    # 화면 크기 지정해 스크린 생성
    screen = pygame.display.set_mode(size)
    # 제목인 캡션 지정
    pygame.display.set_caption('첫 파이게임 윈도!')
    
    # 윈도 종료 플래그로 사용되는 변수 초기값 지정
    done = False
    while not done:
    	for event in pygame.event.get(): # 여러 이벤트를 받아 처리
    		if event.type == pygame.QUIT: # 윈도 종료 버튼을 누르면
    			done = True # 프로그램을 종료하기 위해 True 지정
    	screen.fill(WHITE) # 스크린 색상을 흰색으로 지정
    	pygame.display.update() # 화면의 필요한 부분만을 수정
    
    # 메인 루프를 빠져나오면 프로그램 종료
    pygame.quit()
    ```

  * pygame.clock.tick()
    `This method should be called once per frame. It will compute how many milliseconds have passed since the previous call.`
  * canvas.bbox(1) # canvas에 처음 추가된 객체(1)를 둘러싼 바운딩 박스의 좌표를 구함
  * canvas.find_overlapping(x1, y1, x2, y2) # bounding box의 overlapping 영역을 구함(해당 영역에 포함된 객체의 ID 반환)
  * if 2 in overlapping:  # canvas에 두 번째로 추가된 객체(2)가 overlapping에 포함되어 있는지 검사