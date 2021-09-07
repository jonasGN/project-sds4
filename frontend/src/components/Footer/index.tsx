const UserRef = () => {
    return (
        <a href="https://github.com/jonasGN"
            target="_blank"
            rel="noreferrer">Jonas G Neto
        </a>
    )
}

const ClassRef = () => {
    return (
        <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a>
    )
}

const Footer = () => {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">App desenvolvido por <UserRef /></p>
                <p className="text-light"><small><strong>Semana Spring React</strong><br />
                    Evento promovido pela escola DevSuperior: <ClassRef /></small></p>
            </div>
        </footer>
    )
}

export default Footer;