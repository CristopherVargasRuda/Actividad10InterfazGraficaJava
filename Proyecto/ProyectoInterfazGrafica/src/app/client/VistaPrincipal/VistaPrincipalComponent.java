package app.client.VistaPrincipal;

import app.client.Login.LoginComponent;
import app.client.components.barraReproduccion.BarraReproduccionComponent;
import app.client.components.navegacionUsuario.NavegacionUsuarioComponent;
import app.client.components.activity.ActivityComponent;
import app.client.components.albums.AlbumsComponent;
import app.client.components.artists.ArtistsComponent;
import app.client.components.browse.BrowseComponent;
import app.client.components.localFiles.LocalFilesComponent;
import app.client.components.radio.RadioComponent;
import app.client.components.songs.SongsComponent;
import app.client.components.principal.PrincipalComponent;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipalComponent implements ActionListener {

    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private LoginComponent loginComponent;
    private BarraReproduccionComponent barraReproduccionComponent;
    private NavegacionUsuarioComponent navegacionUsuarioComponent;
    private ActivityComponent activityComponent;
    private ArtistsComponent artistsComponent;
    private AlbumsComponent albumsComponent;
    private BrowseComponent browseComponent;
    private LocalFilesComponent localFilesComponent;
    private RadioComponent radioComponent;
    private SongsComponent songsComponent;
    private PrincipalComponent principalComponent;

    public VistaPrincipalComponent(LoginComponent loginComponent) {
        this.loginComponent = loginComponent;
        this.vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        this.barraReproduccionComponent = new BarraReproduccionComponent();
        this.navegacionUsuarioComponent = new NavegacionUsuarioComponent(this);
        this.principalComponent = new PrincipalComponent(this);

        vistaPrincipalTemplate.getpBarra().add(
                barraReproduccionComponent.getBarraReproduccionTemplate()
        );

        vistaPrincipalTemplate.getpNavegacion().add(
                navegacionUsuarioComponent.getNavegacionUsuarioTemplate()
        );

        vistaPrincipalTemplate.getpPrincipal().add(
                principalComponent.getPrincipalTemplate()
        );

        vistaPrincipalTemplate.repaint();
    }

    public void mostrarComponente(String comando) {
        vistaPrincipalTemplate.getpPrincipal().removeAll();
        switch (comando) {
            case "Browse":
                if (this.browseComponent == null) {
                    this.browseComponent = new BrowseComponent();
                }
                vistaPrincipalTemplate.getpPrincipal().add(
                        browseComponent.getBrowseTemplate()
                );
                break;
            case "Activity":
                if (this.activityComponent == null) {
                    this.activityComponent = new ActivityComponent();
                }
                vistaPrincipalTemplate.getpPrincipal().add(
                        activityComponent.getActivityTemplate()
                );
                break;
            case "Radio":
                if (this.radioComponent == null) {
                    this.radioComponent = new RadioComponent();
                }
                vistaPrincipalTemplate.getpPrincipal().add(
                        radioComponent.getRadioTemplate()
                );
                break;
            case "Songs":
                if (this.songsComponent == null) {
                    this.songsComponent = new SongsComponent();
                }
                vistaPrincipalTemplate.getpPrincipal().add(
                        songsComponent.getSongsTemplate()
                );
                break;
            case "Albums":
                if (this.albumsComponent == null) {
                    this.albumsComponent = new AlbumsComponent();
                }
                vistaPrincipalTemplate.getpPrincipal().add(
                        albumsComponent.getAlbumsTemplate()
                );
                break;
            case "Artists":
                if (this.artistsComponent == null) {
                    this.artistsComponent = new ArtistsComponent();
                }
                vistaPrincipalTemplate.getpPrincipal().add(
                        artistsComponent.getArtistsTemplate()
                );
                break;
            case "Local Files":
                if (this.localFilesComponent == null) {
                    this.localFilesComponent = new LocalFilesComponent();
                }
                vistaPrincipalTemplate.getpPrincipal().add(
                        localFilesComponent.getLocalFilesTemplate()
                );
                break;
            case "principal":
                vistaPrincipalTemplate.getpPrincipal().add(
                        principalComponent.getPrincipalTemplate()
                );
                break;
        }
        vistaPrincipalTemplate.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }

    public void moverVentana(int posicionX, int posicionY) {
        this.vistaPrincipalTemplate.setLocation(posicionX, posicionY);
    }

    public void minimizar() {
        this.vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }
}
