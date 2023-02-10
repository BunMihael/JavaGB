from oopHW.HW7.config import get_file_data_path
import os

# Методы saveWorker(), loadWorkers(), для записи и отображения базы данных сотрудников
class Data_File():
    __path: str

    def __init__(self):
        self.__path = get_file_data_path()

    def save_worker(self, worker_list):
        try:
            os.mkdir(self.__path)
            with open(f"{self.__path}/{worker_list[0]}.db", "w+",
                      encoding='UTF-8') as file:
                print(*worker_list, file=file, sep="\n")
        except:
            with open(f"{self.__path}/{worker_list[0]}.db", "w+",
                      encoding='UTF-8') as file:
                print(*worker_list, file=file, sep="\n")

    def load_workers(self):
        file_list = []
        workers_list = []
        try:
            with os.scandir(self.__path) as entries:
                for entry in entries:

                    if entry.is_file():
                        entry = str(entry).replace("<DirEntry '", "").replace(".db'>", "")
                        with open(f'{self.__path}/{entry}.db', "r",
                                  encoding='UTF-8') as file:
                            for line in file.readlines():
                                line = line.replace('\n', '')
                                file_list.append(line)
                            workers_list.append(file_list)
                            file_list = []
                return workers_list
        except:
            return workers_list