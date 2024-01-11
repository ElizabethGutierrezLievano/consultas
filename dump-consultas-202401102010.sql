--
-- PostgreSQL database dump
--

-- Dumped from database version 15.0 (Ubuntu 15.0-1.pgdg18.04+1)
-- Dumped by pg_dump version 15.3

-- Started on 2024-01-10 20:10:24

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE consultas;
--
-- TOC entry 3352 (class 1262 OID 66288)
-- Name: consultas; Type: DATABASE; Schema: -; Owner: admconsulta
--

CREATE DATABASE consultas WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'en_US.UTF-8';


ALTER DATABASE consultas OWNER TO admconsulta;

\connect consultas

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 6 (class 2615 OID 66289)
-- Name: consulta_app; Type: SCHEMA; Schema: -; Owner: admin
--

CREATE SCHEMA consulta_app;


ALTER SCHEMA consulta_app OWNER TO admin;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 224 (class 1259 OID 66340)
-- Name: c_consultorios; Type: TABLE; Schema: consulta_app; Owner: admin
--

CREATE TABLE consulta_app.c_consultorios (
    id_consultorios smallint NOT NULL,
    consultorios_numero character varying(64) NOT NULL,
    onsultorios_piso character varying(64) NOT NULL,
    fec_cre timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE consulta_app.c_consultorios OWNER TO admin;

--
-- TOC entry 223 (class 1259 OID 66339)
-- Name: c_consultorios_id_consultorios_seq; Type: SEQUENCE; Schema: consulta_app; Owner: admin
--

CREATE SEQUENCE consulta_app.c_consultorios_id_consultorios_seq
    AS smallint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE consulta_app.c_consultorios_id_consultorios_seq OWNER TO admin;

--
-- TOC entry 3353 (class 0 OID 0)
-- Dependencies: 223
-- Name: c_consultorios_id_consultorios_seq; Type: SEQUENCE OWNED BY; Schema: consulta_app; Owner: admin
--

ALTER SEQUENCE consulta_app.c_consultorios_id_consultorios_seq OWNED BY consulta_app.c_consultorios.id_consultorios;


--
-- TOC entry 216 (class 1259 OID 66291)
-- Name: c_doctores; Type: TABLE; Schema: consulta_app; Owner: admin
--

CREATE TABLE consulta_app.c_doctores (
    id_doctores smallint NOT NULL,
    doctores_nombres character varying(64) NOT NULL,
    doctores_a_paterno character varying(64) NOT NULL,
    doctores_a_materno character varying(64),
    id_especialidades smallint NOT NULL,
    fec_cre timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    id_consultorio smallint
);


ALTER TABLE consulta_app.c_doctores OWNER TO admin;

--
-- TOC entry 215 (class 1259 OID 66290)
-- Name: c_doctores_id_doctores_seq; Type: SEQUENCE; Schema: consulta_app; Owner: admin
--

CREATE SEQUENCE consulta_app.c_doctores_id_doctores_seq
    AS smallint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE consulta_app.c_doctores_id_doctores_seq OWNER TO admin;

--
-- TOC entry 3354 (class 0 OID 0)
-- Dependencies: 215
-- Name: c_doctores_id_doctores_seq; Type: SEQUENCE OWNED BY; Schema: consulta_app; Owner: admin
--

ALTER SEQUENCE consulta_app.c_doctores_id_doctores_seq OWNED BY consulta_app.c_doctores.id_doctores;


--
-- TOC entry 218 (class 1259 OID 66297)
-- Name: c_especialidades; Type: TABLE; Schema: consulta_app; Owner: admin
--

CREATE TABLE consulta_app.c_especialidades (
    id_especialidades smallint NOT NULL,
    especialidades_nombre character varying(256),
    especialidades_descrip character varying(512),
    fec_cre timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE consulta_app.c_especialidades OWNER TO admin;

--
-- TOC entry 217 (class 1259 OID 66296)
-- Name: c_especialidades_id_especialidades_seq; Type: SEQUENCE; Schema: consulta_app; Owner: admin
--

CREATE SEQUENCE consulta_app.c_especialidades_id_especialidades_seq
    AS smallint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE consulta_app.c_especialidades_id_especialidades_seq OWNER TO admin;

--
-- TOC entry 3355 (class 0 OID 0)
-- Dependencies: 217
-- Name: c_especialidades_id_especialidades_seq; Type: SEQUENCE OWNED BY; Schema: consulta_app; Owner: admin
--

ALTER SEQUENCE consulta_app.c_especialidades_id_especialidades_seq OWNED BY consulta_app.c_especialidades.id_especialidades;


--
-- TOC entry 220 (class 1259 OID 66314)
-- Name: c_pacientes; Type: TABLE; Schema: consulta_app; Owner: admin
--

CREATE TABLE consulta_app.c_pacientes (
    id_pacientes bigint NOT NULL,
    pacientes_nombres character varying(128) NOT NULL,
    pacientes_a_paterno character varying(128) NOT NULL,
    pacientes_a_materno character varying(128),
    fec_cre timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE consulta_app.c_pacientes OWNER TO admin;

--
-- TOC entry 219 (class 1259 OID 66313)
-- Name: c_pacientes_id_pacientes_seq; Type: SEQUENCE; Schema: consulta_app; Owner: admin
--

CREATE SEQUENCE consulta_app.c_pacientes_id_pacientes_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE consulta_app.c_pacientes_id_pacientes_seq OWNER TO admin;

--
-- TOC entry 3356 (class 0 OID 0)
-- Dependencies: 219
-- Name: c_pacientes_id_pacientes_seq; Type: SEQUENCE OWNED BY; Schema: consulta_app; Owner: admin
--

ALTER SEQUENCE consulta_app.c_pacientes_id_pacientes_seq OWNED BY consulta_app.c_pacientes.id_pacientes;


--
-- TOC entry 222 (class 1259 OID 66322)
-- Name: tx_citas; Type: TABLE; Schema: consulta_app; Owner: admin
--

CREATE TABLE consulta_app.tx_citas (
    id_citas bigint NOT NULL,
    id_doctores smallint NOT NULL,
    id_pacientes smallint NOT NULL,
    citas_horario date NOT NULL,
    fec_cre timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE consulta_app.tx_citas OWNER TO admin;

--
-- TOC entry 221 (class 1259 OID 66321)
-- Name: tx_citas_id_citas_seq; Type: SEQUENCE; Schema: consulta_app; Owner: admin
--

CREATE SEQUENCE consulta_app.tx_citas_id_citas_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE consulta_app.tx_citas_id_citas_seq OWNER TO admin;

--
-- TOC entry 3357 (class 0 OID 0)
-- Dependencies: 221
-- Name: tx_citas_id_citas_seq; Type: SEQUENCE OWNED BY; Schema: consulta_app; Owner: admin
--

ALTER SEQUENCE consulta_app.tx_citas_id_citas_seq OWNED BY consulta_app.tx_citas.id_citas;


--
-- TOC entry 3179 (class 2604 OID 66343)
-- Name: c_consultorios id_consultorios; Type: DEFAULT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_consultorios ALTER COLUMN id_consultorios SET DEFAULT nextval('consulta_app.c_consultorios_id_consultorios_seq'::regclass);


--
-- TOC entry 3171 (class 2604 OID 66294)
-- Name: c_doctores id_doctores; Type: DEFAULT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_doctores ALTER COLUMN id_doctores SET DEFAULT nextval('consulta_app.c_doctores_id_doctores_seq'::regclass);


--
-- TOC entry 3173 (class 2604 OID 66300)
-- Name: c_especialidades id_especialidades; Type: DEFAULT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_especialidades ALTER COLUMN id_especialidades SET DEFAULT nextval('consulta_app.c_especialidades_id_especialidades_seq'::regclass);


--
-- TOC entry 3175 (class 2604 OID 66317)
-- Name: c_pacientes id_pacientes; Type: DEFAULT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_pacientes ALTER COLUMN id_pacientes SET DEFAULT nextval('consulta_app.c_pacientes_id_pacientes_seq'::regclass);


--
-- TOC entry 3177 (class 2604 OID 66325)
-- Name: tx_citas id_citas; Type: DEFAULT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.tx_citas ALTER COLUMN id_citas SET DEFAULT nextval('consulta_app.tx_citas_id_citas_seq'::regclass);


--
-- TOC entry 3346 (class 0 OID 66340)
-- Dependencies: 224
-- Data for Name: c_consultorios; Type: TABLE DATA; Schema: consulta_app; Owner: admin
--

INSERT INTO consulta_app.c_consultorios VALUES (1, 'Consultorio 1', 'Piso 1', '2024-01-10 17:41:09.680153');
INSERT INTO consulta_app.c_consultorios VALUES (2, 'Consultorio 2', 'Piso 1', '2024-01-10 17:41:09.850566');
INSERT INTO consulta_app.c_consultorios VALUES (3, 'Consultorio 3', 'Piso 2', '2024-01-10 17:41:10.020076');
INSERT INTO consulta_app.c_consultorios VALUES (4, 'Consultorio 4', 'Piso 2', '2024-01-10 17:41:10.190115');
INSERT INTO consulta_app.c_consultorios VALUES (5, 'Consultorio 5', 'Piso 3', '2024-01-10 17:41:10.359809');


--
-- TOC entry 3338 (class 0 OID 66291)
-- Dependencies: 216
-- Data for Name: c_doctores; Type: TABLE DATA; Schema: consulta_app; Owner: admin
--

INSERT INTO consulta_app.c_doctores VALUES (1, 'Sheldon', 'Lee', 'Cooper', 1, '2024-01-10 17:28:33.338216', 1);
INSERT INTO consulta_app.c_doctores VALUES (2, 'Bernadette', 'Rostenkowski ', NULL, 2, '2024-01-10 17:29:13.096381', 2);
INSERT INTO consulta_app.c_doctores VALUES (3, 'Amy', 'Farrah', 'Fowler', 3, '2024-01-10 17:29:41.039074', 3);
INSERT INTO consulta_app.c_doctores VALUES (4, 'Leonard', 'Hofstadter', NULL, 4, '2024-01-10 17:30:07.493193', 4);
INSERT INTO consulta_app.c_doctores VALUES (5, 'Beverly ', 'Hofstadter ', NULL, 5, '2024-01-10 17:30:37.240947', 5);


--
-- TOC entry 3340 (class 0 OID 66297)
-- Dependencies: 218
-- Data for Name: c_especialidades; Type: TABLE DATA; Schema: consulta_app; Owner: admin
--

INSERT INTO consulta_app.c_especialidades VALUES (1, 'Cardiología ', 'Cardiología clínica', '2024-01-10 17:08:00.794329');
INSERT INTO consulta_app.c_especialidades VALUES (2, 'Pediatria', 'Pediátrica clínica', '2024-01-10 17:11:03.661768');
INSERT INTO consulta_app.c_especialidades VALUES (3, 'Dermatología', 'Dermatología terapeutica', '2024-01-10 17:11:03.848282');
INSERT INTO consulta_app.c_especialidades VALUES (4, 'Gastroenterología', 'Gastroenterología clínica', '2024-01-10 17:11:04.024754');
INSERT INTO consulta_app.c_especialidades VALUES (5, 'Ginegología', 'Ginegología y obstetricia', '2024-01-10 17:11:04.212311');


--
-- TOC entry 3342 (class 0 OID 66314)
-- Dependencies: 220
-- Data for Name: c_pacientes; Type: TABLE DATA; Schema: consulta_app; Owner: admin
--

INSERT INTO consulta_app.c_pacientes VALUES (1, 'Penny', 'Medianoche', 'Hernandez', '2024-01-10 17:33:34.733907');
INSERT INTO consulta_app.c_pacientes VALUES (2, 'Danna', 'Scully', NULL, '2024-01-10 17:33:34.905541');
INSERT INTO consulta_app.c_pacientes VALUES (3, 'Fox', 'Mulder', 'Beltran', '2024-01-10 17:33:50.417281');
INSERT INTO consulta_app.c_pacientes VALUES (4, 'Rachel', 'Green', 'Arabelo', '2024-01-10 17:34:24.705983');
INSERT INTO consulta_app.c_pacientes VALUES (5, 'Elizabeth', 'Bennet', NULL, '2024-01-10 17:34:44.383137');


--
-- TOC entry 3344 (class 0 OID 66322)
-- Dependencies: 222
-- Data for Name: tx_citas; Type: TABLE DATA; Schema: consulta_app; Owner: admin
--



--
-- TOC entry 3358 (class 0 OID 0)
-- Dependencies: 223
-- Name: c_consultorios_id_consultorios_seq; Type: SEQUENCE SET; Schema: consulta_app; Owner: admin
--

SELECT pg_catalog.setval('consulta_app.c_consultorios_id_consultorios_seq', 5, true);


--
-- TOC entry 3359 (class 0 OID 0)
-- Dependencies: 215
-- Name: c_doctores_id_doctores_seq; Type: SEQUENCE SET; Schema: consulta_app; Owner: admin
--

SELECT pg_catalog.setval('consulta_app.c_doctores_id_doctores_seq', 5, true);


--
-- TOC entry 3360 (class 0 OID 0)
-- Dependencies: 217
-- Name: c_especialidades_id_especialidades_seq; Type: SEQUENCE SET; Schema: consulta_app; Owner: admin
--

SELECT pg_catalog.setval('consulta_app.c_especialidades_id_especialidades_seq', 5, true);


--
-- TOC entry 3361 (class 0 OID 0)
-- Dependencies: 219
-- Name: c_pacientes_id_pacientes_seq; Type: SEQUENCE SET; Schema: consulta_app; Owner: admin
--

SELECT pg_catalog.setval('consulta_app.c_pacientes_id_pacientes_seq', 5, true);


--
-- TOC entry 3362 (class 0 OID 0)
-- Dependencies: 221
-- Name: tx_citas_id_citas_seq; Type: SEQUENCE SET; Schema: consulta_app; Owner: admin
--

SELECT pg_catalog.setval('consulta_app.tx_citas_id_citas_seq', 1, false);


--
-- TOC entry 3188 (class 2606 OID 66328)
-- Name: tx_citas pk_citas; Type: CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.tx_citas
    ADD CONSTRAINT pk_citas PRIMARY KEY (id_citas);


--
-- TOC entry 3190 (class 2606 OID 66346)
-- Name: c_consultorios pk_consultorios; Type: CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_consultorios
    ADD CONSTRAINT pk_consultorios PRIMARY KEY (id_consultorios);


--
-- TOC entry 3182 (class 2606 OID 66305)
-- Name: c_doctores pk_doctores; Type: CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_doctores
    ADD CONSTRAINT pk_doctores PRIMARY KEY (id_doctores);


--
-- TOC entry 3184 (class 2606 OID 66307)
-- Name: c_especialidades pk_especialidades; Type: CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_especialidades
    ADD CONSTRAINT pk_especialidades PRIMARY KEY (id_especialidades);


--
-- TOC entry 3186 (class 2606 OID 66320)
-- Name: c_pacientes pk_pacientes; Type: CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_pacientes
    ADD CONSTRAINT pk_pacientes PRIMARY KEY (id_pacientes);


--
-- TOC entry 3191 (class 2606 OID 66347)
-- Name: c_doctores c_doctores_consul_fk; Type: FK CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_doctores
    ADD CONSTRAINT c_doctores_consul_fk FOREIGN KEY (id_consultorio) REFERENCES consulta_app.c_consultorios(id_consultorios);


--
-- TOC entry 3192 (class 2606 OID 66308)
-- Name: c_doctores c_doctores_fk; Type: FK CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.c_doctores
    ADD CONSTRAINT c_doctores_fk FOREIGN KEY (id_especialidades) REFERENCES consulta_app.c_especialidades(id_especialidades);


--
-- TOC entry 3193 (class 2606 OID 66329)
-- Name: tx_citas tx_citas_fk; Type: FK CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.tx_citas
    ADD CONSTRAINT tx_citas_fk FOREIGN KEY (id_doctores) REFERENCES consulta_app.c_doctores(id_doctores);


--
-- TOC entry 3194 (class 2606 OID 66334)
-- Name: tx_citas tx_citas_fk_1; Type: FK CONSTRAINT; Schema: consulta_app; Owner: admin
--

ALTER TABLE ONLY consulta_app.tx_citas
    ADD CONSTRAINT tx_citas_fk_1 FOREIGN KEY (id_pacientes) REFERENCES consulta_app.c_pacientes(id_pacientes);


-- Completed on 2024-01-10 20:10:47

--
-- PostgreSQL database dump complete
--

