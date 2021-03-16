package sn.locaton.Controller;


import sn.locaton.Domain.Annonce;
import sn.locaton.Repository.AnnonceRepository;
import sn.locaton.Repository.jdbc.DataSource;
import sn.locaton.Repository.jdbc.JdbcBaseAnnonceRepository;
import sn.locaton.Repository.jdbc.MysqlDataSource;
import sn.locaton.Repository.ram.ListBaseAnnonceRepository;
import sn.locaton.service.DisplayService;
import sn.locaton.service.MenuService;
import sn.locaton.service.console.ConsoleDisplayService;
import sn.locaton.service.console.ScannerMenuService;

public class ClientController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;

    public ClientController(){

        DataSource dataSource = new MysqlDataSource();
        displayService = new ConsoleDisplayService();
        AnnonceRepository annonceRepository = new JdbcBaseAnnonceRepository(dataSource);
        AnnonceRepository voitureRepository = new ListBaseAnnonceRepository(dataSource);
        scannerMenuService = new ScannerMenuService(displayService, voitureRepository, annonceRepository );
    }

    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }



}
