from oopHW.HW7.mvp import Presenter, View_Console, Data_File

# Метод click() служит для работы в меню пользователя
class App:
    @staticmethod
    def click():
        presenter = Presenter(view=View_Console(), data=Data_File())
        while True:
            presenter.show_menu()
            choose = presenter.input_menu()
            if choose == "1":
                presenter.add_worker()
            elif choose == "2":
                presenter.show_workers()
            elif choose == "0":
                break
            else:
                presenter.show_error()
        presenter.show_exit()