package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.search"));
				if (Var.valueOf(Var.valueOf(item.equals(Var.valueOf("Brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("BRASIL"))).getObjectAsBoolean()).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Estados Unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("estados unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ESTADOS UNIDOS"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao USA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ARGENTINA"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo a ARGENTINA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("CHILE"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"),
							Var.valueOf("Ok, você pesquisou por um país que não ESTÁ LISTADO. Continue usando"));
				}
				if (Var.valueOf(Var.valueOf(item.equals(Var.valueOf("Brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("BRASIL"))).getObjectAsBoolean()).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Estados Unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("estados unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ESTADOS UNIDOS"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao USA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ARGENTINA"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo a ARGENTINA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("CHILE"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"),
							Var.valueOf("Ok, você pesquisou por um país que não ESTÁ LISTADO. Continue usando"));
				}
				if (Var.valueOf(Var.valueOf(item.equals(Var.valueOf("Brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("BRASIL"))).getObjectAsBoolean()).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Estados Unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("estados unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ESTADOS UNIDOS"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao USA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ARGENTINA"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo a ARGENTINA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("CHILE"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"),
							Var.valueOf("Ok, você pesquisou por um país que não ESTÁ LISTADO. Continue usando"));
				}
				if (Var.valueOf(Var.valueOf(item.equals(Var.valueOf("Brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("BRASIL"))).getObjectAsBoolean()).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Estados Unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("estados unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ESTADOS UNIDOS"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao USA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ARGENTINA"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo a ARGENTINA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("CHILE"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"),
							Var.valueOf("Ok, você pesquisou por um país que não ESTÁ LISTADO. Continue usando"));
				}
				if (Var.valueOf(Var.valueOf(item.equals(Var.valueOf("Brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("BRASIL"))).getObjectAsBoolean()).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Estados Unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("estados unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ESTADOS UNIDOS"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao USA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ARGENTINA"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo a ARGENTINA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("CHILE"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"),
							Var.valueOf("Ok, você pesquisou por um país que não ESTÁ LISTADO. Continue usando"));
				}
				if (Var.valueOf(Var.valueOf(item.equals(Var.valueOf("Brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("brasil"))).getObjectAsBoolean()
						|| Var.valueOf(item.equals(Var.valueOf("BRASIL"))).getObjectAsBoolean()).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Estados Unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("estados unidos"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ESTADOS UNIDOS"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao USA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("argentina"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("ARGENTINA"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo a ARGENTINA!"));
				} else if (Var
						.valueOf(Var.valueOf(item.equals(Var.valueOf("Chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("chile"))).getObjectAsBoolean()
								|| Var.valueOf(item.equals(Var.valueOf("CHILE"))).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"), Var.valueOf("Bem vindo ao Brasil!"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("info"),
							Var.valueOf("Ok, você pesquisou por um país que não ESTÁ LISTADO. Continue usando"));
				}
				return Var.VAR_NULL;
			}
		}.call();
	}

}
